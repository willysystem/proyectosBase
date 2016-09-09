package sinergia.movie.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @generated
 */
@javax.persistence.Entity
public class Genre implements java.io.Serializable {
	/**
	 * @generated
	 */
	private static final long serialVersionUID = 1639460300L;
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
	private java.util.Set<Movie> movies = new java.util.HashSet<Movie>();

	/**
	 * @generated
	 */
	public Genre() {
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
		return "Genre" + " id=" + id + " name=" + name;
	}

	/**
	 * @generated
	 */
	@javax.persistence.ManyToMany
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
		movies.getGenres().add(this);
	}

	/**
	 * @generated
	 */
	public void removeMovies(Movie movies) {
		getMovies().remove(movies);
		movies.getGenres().remove(this);
	}
}