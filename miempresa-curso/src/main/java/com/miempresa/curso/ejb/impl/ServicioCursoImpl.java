package com.miempresa.curso.ejb.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.slf4j.Logger;

import com.miempresa.curso.dto.CursoDTO;
import com.miempresa.curso.ejb.ServicioCurso;
import com.miempresa.curso.ejb.dao.CursoDao;
import com.miempresa.curso.model.Curso;

@Stateless
@Remote(ServicioCurso.class)
@TransactionManagement(TransactionManagementType.CONTAINER)
public class ServicioCursoImpl implements ServicioCurso {
	
	@Inject
	private Logger log;
	
	@Inject
	private CursoDao cursoDao;
	
	@Inject
	protected EntityManager em;

	@Override
	public void actualizar(CursoDTO cursoDTO) {
		
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	public void crearCurso(CursoDTO cursoDTO) {
		log.debug("creando curso");
		Curso curso =  new Curso();
		//curso.setId(10L);
		curso.setNombre(cursoDTO.getNombre());
		List<Curso> cursos =  cursoDao.findAll(Curso.class);
		log.info("curos.size: " + cursos.size());
		cursoDao.persist(curso);
		Curso curso2 =  new Curso();
		curso2.setId(7L);
		curso2.setNombre(cursoDTO.getNombre() + "2");
	    cursoDao.persist(curso2);
	}

	@Override
	public void delete(CursoDTO cursoDTO) {
		Curso curso =  new Curso();
		curso.setId(cursoDTO.getId());
		cursoDao.delete(curso);
	}

	@Override
	public List<CursoDTO> getCursos() {
		List<CursoDTO> cursosDTO = new ArrayList<CursoDTO>();
		List<Curso> cursos = cursoDao.findAll(Curso.class);
		for (Curso curso : cursos) {
			CursoDTO cursoDTO = new CursoDTO();
			cursoDTO.setId(curso.getId());
			cursoDTO.setNombre(curso.getNombre());
			cursosDTO.add(cursoDTO);
		}
		return cursosDTO;
	}
	
	


}
