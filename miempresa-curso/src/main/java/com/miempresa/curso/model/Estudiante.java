package com.miempresa.curso.model;

/**
 * @generated
 */
@javax.persistence.Entity
public abstract class Estudiante extends Entidad {
	/**
	 * @generated
	 */
	private java.util.Set<Paralelo> paralelo = new java.util.HashSet<Paralelo>();

	/**
	 * @generated
	 */
	private static final long serialVersionUID = 761431895L;
	

	/**
	 * @generated
	 */
	public Estudiante() {
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
	@javax.persistence.ManyToMany
	public java.util.Set<Paralelo> getParalelo() {
		return this.paralelo;
	}

	/**
	 * @generated
	 */
	public void setParalelo(java.util.Set<Paralelo> paralelo) {
		this.paralelo = paralelo;
	}

	/**
	 * @generated
	 */
	public void addParalelo(Paralelo paralelo) {
		getParalelo().add(paralelo);
		paralelo.getEstudiantes().add(this);
	}

	/**
	 * @generated
	 */
	public void removeParalelo(Paralelo paralelo) {
		getParalelo().remove(paralelo);
		paralelo.getEstudiantes().remove(this);
	}

}