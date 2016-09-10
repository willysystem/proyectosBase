package com.miempresa.curso.dto;

/**
 * @generated
 */
public abstract class EstudianteDTO implements java.io.Serializable {
	/**
	 * @generated
	 */
	private java.util.Set<ParaleloDTO> paralelo = new java.util.HashSet<ParaleloDTO>();

	/**
	 * @generated
	 */
	private static final long serialVersionUID = 761431895L;
	/**
	 * @generated
	 */
	private Long id;

	/**
	 * @generated
	 */
	public EstudianteDTO() {
	}

	/**
	 * @generated
	 */
	public String toString() {
		return "Estudiante" + " id=" + id;
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
		paralelo.getEstudiantes().add(this);
	}

	/**
	 * @generated
	 */
	public void removeParalelo(ParaleloDTO paralelo) {
		getParalelo().remove(paralelo);
		paralelo.getEstudiantes().remove(this);
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
}