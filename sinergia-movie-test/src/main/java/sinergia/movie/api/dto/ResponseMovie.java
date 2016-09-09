package sinergia.movie.api.dto;

import java.util.ArrayList;
import java.util.Collection;

import sinergia.movie.model.Movie;

public class ResponseMovie {
	
	private Collection<Movie> movies = new ArrayList<>();
	
	private Integer total;

	public Collection<Movie> getMovies() {
		return movies;
	}

	public void setMovies(Collection<Movie> movies) {
		this.movies = movies;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}
	
}
