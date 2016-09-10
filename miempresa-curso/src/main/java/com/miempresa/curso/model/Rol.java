package com.miempresa.curso.model;


/**
 * @generated
 */
@javax.persistence.Entity
public class Rol implements java.io.Serializable {
	/**
	 * @generated
	 */
	private static final long serialVersionUID = 670014442L;
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
	private java.util.Set<User> users = new java.util.HashSet<User>();

	/**
	 * @generated
	 */
	public Rol() {
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
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * @generated
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @generated
	 */
	public String toString() {
		return "Rol" + " id=" + id + " nombre=" + nombre;
	}

	/**
	 * @generated
	 */
	@javax.persistence.ManyToMany
	public java.util.Set<User> getUsers() {
		return this.users;
	}

	/**
	 * @generated
	 */
	public void setUsers(java.util.Set<User> users) {
		this.users = users;
	}

	/**
	 * @generated
	 */
	public void addUsers(User users) {
		getUsers().add(users);
		users.getRoles().add(this);
	}

	/**
	 * @generated
	 */
	public void removeUsers(User users) {
		getUsers().remove(users);
		users.getRoles().remove(this);
	}
}