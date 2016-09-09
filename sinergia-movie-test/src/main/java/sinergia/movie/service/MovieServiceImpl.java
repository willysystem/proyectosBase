package sinergia.movie.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sinergia.movie.api.dto.ResponseMovie;
import sinergia.movie.model.Movie;
import sinergia.movie.model.MovieWatched;
import sinergia.movie.model.User;
import sinergia.movie.repository.MovieRepository;
import sinergia.movie.repository.UserRepository;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public Collection<Movie> findAll() {
		Collection<Movie> movies = movieRepository.findAll(); 
		return movies;
	}

	@Override
	public Collection<Movie> getTopTenMovies(Integer age) {
		Date now = new Date();
		@SuppressWarnings("deprecation")
		Integer yearBirthDay = now.getYear() - age;
		Collection<Movie> movies = movieRepository.findTopTenMovies(yearBirthDay+1900);
		Collection<Movie> moviesTop10 = new ArrayList<Movie>();
		int i = 1;
		for (Movie movie : movies) {
			if(i <= 10){
				moviesTop10.add(movie);
				i++;
			} else {
				break;
			}
		}		
		return moviesTop10;
	}

	@Override
	public Collection<User> finAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public ResponseMovie findAllMovies(Long idUser) {
		Collection<Movie> movies = movieRepository.findAllMovies(idUser);
		ResponseMovie responseMovie = new ResponseMovie();
		responseMovie.setMovies(movies);
		responseMovie.setTotal(movies.size());
		return responseMovie;
	}

	@Override
	public Float getAverangeRating(Long movieId) {
		return movieRepository.getAverangeRating(movieId);
	}

	@Override
	public Collection<Movie> getTop20Movies(String state) {
		Collection<Movie> movies = movieRepository.getTop20Movies(state);
		Collection<Movie> moviesTop10 = new ArrayList<Movie>();
		int i = 1;
		for (Movie movie : movies) {
			if(i <= 20){
				moviesTop10.add(movie);
				i++;
			} else {
				break;
			}
		}		
		return moviesTop10;		
	}

	@SuppressWarnings("deprecation")
	@Override
	public Collection<Movie> getTop5(String genre, Long idUser) {
		Collection<Movie> movies = movieRepository.getTop5(genre, idUser);
		Collection<Movie> moviesAux = new HashSet<>();
		User user = userRepository.findOne(idUser);
		Date birtDate = user.getBirthDate();
		long lapse = new Date().getTime() - birtDate.getTime();
		Date lapseDate = new Date(lapse);
		Integer ageUser = lapseDate.getYear();
		
		for (Movie movie : movies) {
			for(MovieWatched movieWatched: movie.getMovieWatcheds()){
				Date dateWatched = movieWatched.getDateWatched();
				long lapseTime = new Date().getTime() - dateWatched.getTime();
				Date lapseDateTime = new Date(lapseTime);
				Integer ageOtherUser = lapseDateTime.getYear();
				if((ageUser+5)>=ageOtherUser && (ageOtherUser-5)<=ageOtherUser){
					moviesAux.add(movie);
				}
			}
		}
		
		List<Movie> moviesTop5 = new ArrayList<>();
		int i = 1;
		for (Movie movie : moviesAux) {
			if(i <= 5){
				moviesTop5.add(movie);
				i++;
			} else {
				break;
			}
		}		
		Collections.sort(moviesTop5);
		return moviesTop5;
	}
	
}
