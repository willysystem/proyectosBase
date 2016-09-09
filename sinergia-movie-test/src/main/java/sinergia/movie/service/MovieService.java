package sinergia.movie.service;

import java.util.Collection;

import sinergia.movie.api.dto.ResponseMovie;
import sinergia.movie.model.Movie;
import sinergia.movie.model.User;

public interface MovieService {
	
	public Collection<Movie> findAll();
	
	public Collection<Movie> getTopTenMovies(Integer age);
	
	public Collection<User> finAllUsers();
	
	public ResponseMovie findAllMovies(Long idUser);
	
	public Float getAverangeRating(Long movieId);
	
	public Collection<Movie> getTop20Movies(String state);
	
	public Collection<Movie> getTop5(String genre, Long idUser);
	
}
