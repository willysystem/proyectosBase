package sinergia.movie.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @generated
 */
@javax.persistence.Entity
public class Movie implements java.io.Serializable, Comparable<Movie> {
	/**
	 * @generated
	 */
	private static final long serialVersionUID = 1645306745L;
	/**
	 * @generated
	 */
	private Long id;
	/**
	 * @generated
	 */
	private String tittle;
	/**
	 * @generated
	 */
	private Float averangeRate;

	/**
	 * @generated
	 */
	@JsonIgnore
	private java.util.Set<Genre> genres = new java.util.HashSet<Genre>();
	/**
	 * @generated
	 */
	@JsonIgnore
	private java.util.Set<Rating> ratings = new java.util.HashSet<Rating>();

	/**
	 * @generated
	 */
	@JsonIgnore
	private java.util.Set<MovieWatched> movieWatcheds = new java.util.HashSet<MovieWatched>();

	/**
	 * @generated
	 */
	public Movie() {
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
	public String getTittle() {
		return this.tittle;
	}

	/**
	 * @generated
	 */
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	/**
	 * @generated
	 */
	public Float getAverangeRate() {
		return this.averangeRate;
	}

	/**
	 * @generated
	 */
	public void setAverangeRate(Float averangeRate) {
		this.averangeRate = averangeRate;
	}

	/**
	 * @generated
	 */
	public String toString() {
		return "Movie" + " id=" + id + " tittle=" + tittle + " averangeRate="
				+ averangeRate;
	}

	/**
	 * @generated
	 */
	@javax.persistence.ManyToMany(mappedBy = "movies")
	public java.util.Set<Genre> getGenres() {
		return this.genres;
	}

	/**
	 * @generated
	 */
	public void setGenres(java.util.Set<Genre> genres) {
		this.genres = genres;
	}

	/**
	 * @generated
	 */
	public void addGenres(Genre genres) {
		getGenres().add(genres);
		genres.getMovies().add(this);
	}

	/**
	 * @generated
	 */
	public void removeGenres(Genre genres) {
		getGenres().remove(genres);
		genres.getMovies().remove(this);
	}

	/**
	 * @generated
	 */
	@javax.persistence.ManyToMany
	public java.util.Set<Rating> getRatings() {
		return this.ratings;
	}

	/**
	 * @generated
	 */
	public void setRatings(java.util.Set<Rating> ratings) {
		this.ratings = ratings;
	}

	/**
	 * @generated
	 */
	public void addRatings(Rating ratings) {
		getRatings().add(ratings);
		ratings.getMovies().add(this);
	}

	/**
	 * @generated
	 */
	public void removeRatings(Rating ratings) {
		getRatings().remove(ratings);
		ratings.getMovies().remove(this);
	}

	/**
	 * @generated
	 */
	@javax.persistence.OneToMany(mappedBy = "movie")
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
		movieWatcheds.setMovie(this);
	}

	/**
	 * @generated
	 */
	public void removeMovieWatcheds(MovieWatched movieWatcheds) {
		getMovieWatcheds().remove(movieWatcheds);
		movieWatcheds.setMovie(null);
	}

	@Override
	public int compareTo(Movie other) {
		int i = (this.averangeRate >= other.averangeRate)?0:1;
		return i;
	}
}