package com.miempresa.curso.model;


/**
 * @generated
 */
@javax.persistence.Entity
public class Curso extends Entidad implements java.io.Serializable {
	/**
	 * @generated
	 */
	private java.util.Set<Paralelo> paralelo = new java.util.HashSet<Paralelo>();

	/**
	 * @generated
	 */
	private static final long serialVersionUID = -374880265L;

	/**
	 * @generated
	 */
	private String nombre;

	/**
	 * @generated
	 */
	public Curso() {
	}

	/**
	 * @generated
	 */
	public String toString() {
		return "Curso" + " nombre=" + nombre + " id=" + id;
	}

	/**
	 * @generated
	 */
	@javax.persistence.OneToMany(mappedBy = "curso")
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
		paralelo.setCurso(this);
	}

	/**
	 * @generated
	 */
	public void removeParalelo(Paralelo paralelo) {
		getParalelo().remove(paralelo);
		paralelo.setCurso(null);
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