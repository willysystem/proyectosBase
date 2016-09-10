package com.miempresa.curso.ejb;

import java.util.List;

import com.miempresa.curso.dto.CursoDTO;

public interface ServicioCurso {
	
	public void crearCurso(CursoDTO cursoDTO) throws Exception;
	
	public void actualizar(CursoDTO cursoDTO);
	
	public void delete(CursoDTO cursoDTO);
	
	public List<CursoDTO> getCursos();
	
}
