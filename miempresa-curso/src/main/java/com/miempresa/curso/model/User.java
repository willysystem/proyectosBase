package com.miempresa.curso.model;


/**
 * @generated
 */
@javax.persistence.Entity
public class User implements java.io.Serializable {
	/**
	 * @generated
	 */
	private static final long serialVersionUID = -704295664L;
	/**
	 * @generated
	 */
	private Long id;

	/**
	 * @generated
	 */
	private java.util.Set<Rol> roles = new java.util.HashSet<Rol>();
	/**
	 * @generated
	 */
	private String user;
	/**
	 * @generated
	 */
	private String password;

	/**
	 * @generated
	 */
	public User() {
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
		return "User" + " id=" + id + " user=" + user + " password=" + password;
	}

	/**
	 * @generated
	 */
	@javax.persistence.ManyToMany(mappedBy = "users")
	public java.util.Set<Rol> getRoles() {
		return this.roles;
	}

	/**
	 * @generated
	 */
	public void setRoles(java.util.Set<Rol> roles) {
		this.roles = roles;
	}

	/**
	 * @generated
	 */
	public void addRoles(Rol roles) {
		getRoles().add(roles);
		roles.getUsers().add(this);
	}

	/**
	 * @generated
	 */
	public void removeRoles(Rol roles) {
		getRoles().remove(roles);
		roles.getUsers().remove(this);
	}

	/**
	 * @generated
	 */
	public String getUser() {
		return this.user;
	}

	/**
	 * @generated
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @generated
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * @generated
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}