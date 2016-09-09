package sinergia.movie.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @generated
 */
@javax.persistence.Entity
public class Rating implements java.io.Serializable {
	/**
	 * @generated
	 */
	private static final long serialVersionUID = -404941196L;
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
	private String description;

	/**
	 * @generated
	 */
	@JsonIgnore
	private java.util.Set<Movie> movies = new java.util.HashSet<Movie>();

	/**
	 * @generated
	 */
	public Rating() {
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
	public String getDescription() {
		return this.description;
	}

	/**
	 * @generated
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @generated
	 */
	public String toString() {
		return "Rating" + " id=" + id + " name=" + name + " description="
				+ description;
	}

	/**
	 * @generated
	 */
	@javax.persistence.ManyToMany(mappedBy = "ratings")
	public java.util.Set<Movie> getMovies() {
		return this.movies;
	}

	/**
	 * @generated
	 */
	public void setMovies(java.util.Set<Movie> movies) {
		this.movies = movies;
	}

	/**
	 * @generated
	 */
	public void addMovies(Movie movies) {
		getMovies().add(movies);
		movies.getRatings().add(this);
	}

	/**
	 * @generated
	 */
	public void removeMovies(Movie movies) {
		getMovies().remove(movies);
		movies.getRatings().remove(this);
	}
}