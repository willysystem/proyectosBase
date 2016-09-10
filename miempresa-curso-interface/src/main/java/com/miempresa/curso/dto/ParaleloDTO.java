package com.miempresa.curso.dto;


/**
 * @generated
 */
public class ParaleloDTO implements java.io.Serializable {
	/**
	 * @generated
	 */
	private java.util.Set<EstudianteDTO> estudiantes = new java.util.HashSet<EstudianteDTO>();
	/**
	 * @generated
	 */
	private CursoDTO curso;

	/**
	 * @generated
	 */
	private static final long serialVersionUID = -548123807L;
	/**
	 * @generated
	 */
	private Long id;

	/**
	 * @generated
	 */
	public String toString() {
		return "Paralelo" + " id=" + id;
	}

	/**
	 * @generated
	 */
	public ParaleloDTO() {
	}

	/**
	 * @generated
	 */
	public java.util.Set<EstudianteDTO> getEstudiantes() {
		return this.estudiantes;
	}

	/**
	 * @generated
	 */
	public void setEstudiantes(java.util.Set<EstudianteDTO> estudiantes) {
		this.estudiantes = estudiantes;
	}

	/**
	 * @generated
	 */
	public void addEstudiantes(EstudianteDTO estudiantes) {
		getEstudiantes().add(estudiantes);
		estudiantes.getParalelo().add(this);
	}

	/**
	 * @generated
	 */
	public void removeEstudiantes(EstudianteDTO estudiantes) {
		getEstudiantes().remove(estudiantes);
		estudiantes.getParalelo().remove(this);
	}

	/**
	 * @generated
	 */
	public CursoDTO getCurso() {
		return this.curso;
	}

	/**
	 * @generated
	 */
	public void setCurso(CursoDTO curso) {
		this.curso = curso;
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