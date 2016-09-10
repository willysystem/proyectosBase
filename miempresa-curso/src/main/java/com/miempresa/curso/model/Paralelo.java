package com.miempresa.curso.model;


/**
 * @generated
 */
@javax.persistence.Entity
public class Paralelo extends Entidad implements java.io.Serializable {
	/**
	 * @generated
	 */
	private java.util.Set<Estudiante> estudiantes = new java.util.HashSet<Estudiante>();
	/**
	 * @generated
	 */
	private Curso curso;

	/**
	 * @generated
	 */
	private static final long serialVersionUID = -548123807L;
	

	/**
	 * @generated
	 */
	public String toString() {
		return "Paralelo" + " id=" + id;
	}

	/**
	 * @generated
	 */
	public Paralelo() {
	}

	/**
	 * @generated
	 */
	@javax.persistence.ManyToMany(mappedBy = "paralelo")
	public java.util.Set<Estudiante> getEstudiantes() {
		return this.estudiantes;
	}

	/**
	 * @generated
	 */
	public void setEstudiantes(java.util.Set<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	/**
	 * @generated
	 */
	public void addEstudiantes(Estudiante estudiantes) {
		getEstudiantes().add(estudiantes);
		estudiantes.getParalelo().add(this);
	}

	/**
	 * @generated
	 */
	public void removeEstudiantes(Estudiante estudiantes) {
		getEstudiantes().remove(estudiantes);
		estudiantes.getParalelo().remove(this);
	}

	/**
	 * @generated
	 */
	@javax.persistence.ManyToOne(optional = false)
	public Curso getCurso() {
		return this.curso;
	}

	/**
	 * @generated
	 */
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}