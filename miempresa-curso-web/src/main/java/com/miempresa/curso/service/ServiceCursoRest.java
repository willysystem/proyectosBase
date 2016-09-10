package com.miempresa.curso.service;

import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.validation.constraints.Pattern;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.miempresa.curso.dto.CursoDTO;
import com.miempresa.curso.ejb.ServicioCurso;

@Path("/curso")
public class ServiceCursoRest {

	@Path("/crearCurso/{nombre}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String crearCurso(@Pattern(regexp = "[A-Za-z]+$", message = "Nombre no debe tener numeros")
			                @PathParam("nombre") 
	                        String nombre) {
		
		ServicioCurso servicioCurso = lookupServicioCurso();
		CursoDTO cursoDTO = new CursoDTO();
		cursoDTO.setNombre(nombre);
		try {
			servicioCurso.crearCurso(cursoDTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "Curso " + nombre + " creado";
	}
	
	@Path("/cursos")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
    public List<CursoDTO> getCursos(){
    	
    	CursoDTO c = new CursoDTO();
    	c.setId(1L);
    	c.setNombre("Curso de Java");
    	
    	List<CursoDTO> cursos = new ArrayList<CursoDTO>();
    	cursos.add(c);
    	
    	return cursos;
    }
	
	private ServicioCurso lookupServicioCurso(){
		Context ctx = null;
		ServicioCurso servicioCurso = null;
		try {
			ctx = new InitialContext();
			servicioCurso = (ServicioCurso)ctx.lookup("java:global/miempresa-curso/ServicioCursoImpl!com.miempresa.curso.ejb.ServicioCurso");
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return servicioCurso;
	}
	
}
