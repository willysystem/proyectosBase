package sinergia.movie.model;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @generated
 */
@javax.persistence.Entity
public class User implements java.io.Serializable {
	/**
	 * @generated
	 */
	private static final long serialVersionUID = 191863394L;
	/**
	 * @generated
	 */
	private Long id;
	
	private String name;
	
	/**
	 * @generated
	 */
	private State state;
	/**
	 * @generated
	 */
	@JsonIgnore
	private java.util.Set<MovieWatched> movieWatcheds = new java.util.HashSet<MovieWatched>();
	/**
	 * @generated
	 */
	@Temporal(TemporalType.DATE)
	private java.util.Date birthDate;
	/**
	 * @generated
	 */
	public User() {
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
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
		return "User" + " id=" + id + " birthDate=" + birthDate;
	}

	/**
	 * @generated
	 */
	@javax.persistence.ManyToOne
	public State getState() {
		return this.state;
	}

	/**
	 * @generated
	 */
	public void setState(State state) {
		this.state = state;
	}

	/**
	 * @generated
	 */
	@javax.persistence.OneToMany(mappedBy = "user")
	public java.util.Set<MovieWatched> getMovieWatcheds() {
		return this.movieWatcheds;
	}

	/**
	 * @generated
	 */
	public void setMovieWatcheds(java.util.Set<MovieWatched> movieWatcheds) {
		this.movieWatcheds = movieWatcheds;
	}

	/**
	 * @generated
	 */
	public void addMovieWatcheds(MovieWatched movieWatcheds) {
		getMovieWatcheds().add(movieWatcheds);
		movieWatcheds.setUser(this);
	}

	/**
	 * @generated
	 */
	public void removeMovieWatcheds(MovieWatched movieWatcheds) {
		getMovieWatcheds().remove(movieWatcheds);
		movieWatcheds.setUser(null);
	}

	/**
	 * @generated
	 */
	public java.util.Date getBirthDate() {
		return this.birthDate;
	}

	/**
	 * @generated
	 */
	public void setBirthDate(java.util.Date birthDate) {
		this.birthDate = birthDate;
	}
}