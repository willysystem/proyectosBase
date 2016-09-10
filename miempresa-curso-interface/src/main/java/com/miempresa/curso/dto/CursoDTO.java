package com.miempresa.curso.dto;


/**
 * @generated
 */

public class CursoDTO implements java.io.Serializable {
	/**
	 * @generated
	 */
	private java.util.Set<ParaleloDTO> paralelo = new java.util.HashSet<ParaleloDTO>();

	/**
	 * @generated
	 */
	private static final long serialVersionUID = -374880265L;
	/**
	 * @generated
	 */
	private Long id;

	/**
	 * @generated
	 */
	private String nombre;

	/**
	 * @generated
	 */
	public CursoDTO() {
	}

	@Override
	public String toString() {
		return "Curso [paralelo=" + paralelo + ", id=" + id + ", nombre=" + nombre + "]";
	}

	/**
	 * @generated
	 */
	public java.util.Set<ParaleloDTO> getParalelo() {
		return this.paralelo;
	}

	/**
	 * @generated
	 */
	public void setParalelo(java.util.Set<ParaleloDTO> paralelo) {
		this.paralelo = paralelo;
	}

	/**
	 * @generated
	 */
	public void addParalelo(ParaleloDTO paralelo) {
		getParalelo().add(paralelo);
		paralelo.setCurso(this);
	}

	/**
	 * @generated
	 */
	public void removeParalelo(ParaleloDTO paralelo) {
		getParalelo().remove(paralelo);
		paralelo.setCurso(null);
	}

	/**
	 * @generated
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * @generated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @generated
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * @generated
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}