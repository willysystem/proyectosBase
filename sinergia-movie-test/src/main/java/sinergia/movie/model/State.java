package sinergia.movie.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @generated
 */
@javax.persistence.Entity
public class State implements java.io.Serializable {
	/**
	 * @generated
	 */
	private static final long serialVersionUID = 1650976986L;
	/**
	 * @generated
	 */
	private Long id;
	/**
	 * @generated
	 */
	private String name;

	/**
	 * @generated
	 */
	@JsonIgnore
	private java.util.Set<User> users = new java.util.HashSet<User>();

	/**
	 * @generated
	 */
	public State() {
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
	public String getName() {
		return this.name;
	}

	/**
	 * @generated
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @generated
	 */
	public String toString() {
		return "State" + " id=" + id + " name=" + name;
	}

	/**
	 * @generated
	 */
	@javax.persistence.OneToMany(mappedBy = "state")
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
		users.setState(this);
	}

	/**
	 * @generated
	 */
	public void removeUsers(User users) {
		getUsers().remove(users);
		users.setState(null);
	}
}