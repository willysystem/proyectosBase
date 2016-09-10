package com.miempresa.curso.model;

import javax.persistence.InheritanceType;

/**
 * @generated
 */
@javax.persistence.Entity
@javax.persistence.Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Entidad implements java.io.Serializable {
	/**
	 * @generated
	 */
	private static final long serialVersionUID = 2093463172L;
	/**
	 * @generated
	 */
	protected Long id;

	/**
	 * @generated
	 */
	public Entidad() {
	}

	/**
	 * @generated
	 */
	@javax.persistence.Id
	@javax.persistence.GeneratedValue
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
	public String toString() {
		return "Entidad" + " id=" + id;
	}
}