package com.miempresa.curso.exception;

public class CursoException extends Exception {

	private static final long serialVersionUID = 502931772564760787L;
	
	public CursoException(Long nroException){
		super(nroException + "");
	}

}
