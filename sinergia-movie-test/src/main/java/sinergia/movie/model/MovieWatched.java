package sinergia.movie.model;

import javax.persistence.TemporalType;


/**
 * @generated
 */
@javax.persistence.Entity
public class MovieWatched implements java.io.Serializable {
	/**
	 * @generated
	 */
	private static final long serialVersionUID = 753722357L;
	/**
	 * @generated
	 */
	private Long id;
	/**
	 * @generated
	 */
	private Float rating;
	/**
	 * @generated
	 */
	private User user;
	/**
	 * @generated
	 */
	private Movie movie;

	/**
	 * @generated
	 */
	private java.util.Date dateWatched;

	/**
	 * @generated
	 */
	public String toString() {
		return "MovieWatched" + " id=" + id + " dateWatched=" + dateWatched
				+ " rating=" + rating;
	}

	/**
	 * @generated
	 */
	public MovieWatched() {
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
	public Float getRating() {
		return this.rating;
	}

	/**
	 * @generated
	 */
	public void setRating(Float rating) {
		this.rating = rating;
	}

	/**
	 * @generated
	 */
	@javax.persistence.ManyToOne
	public User getUser() {
		return this.user;
	}

	/**
	 * @generated
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @generated
	 */
	@javax.persistence.ManyToOne
	public Movie getMovie() {
		return this.movie;
	}

	/**
	 * @generated
	 */
	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	/**
	 * @generated
	 */
	@javax.persistence.Temporal(TemporalType.TIMESTAMP)
	public java.util.Date getDateWatched() {
		return this.dateWatched;
	}

	/**
	 * @generated
	 */
	public void setDateWatched(java.util.Date dateWatched) {
		this.dateWatched = dateWatched;
	}
}