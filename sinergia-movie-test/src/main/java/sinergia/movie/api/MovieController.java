package sinergia.movie.api;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import sinergia.movie.api.dto.ResponseMovie;
import sinergia.movie.model.Movie;
import sinergia.movie.model.User;
import sinergia.movie.service.MovieService;

@RestController
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@RequestMapping(value="/topTenMovies/{age}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
    public Collection<Movie> getToTenpMovies(@RequestParam(value="age", defaultValue="36") Integer age) {
		Collection<Movie> movies = movieService.getTopTenMovies(age);
		return movies;
    }
	
	@RequestMapping(value="/getMoviesByUser/{idUser}/", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseMovie> getMoviesByUser(@RequestParam(value="idUser", defaultValue="1") Long idUser){
		ResponseMovie responseMovie = movieService.findAllMovies(idUser);
		return new ResponseEntity<>(responseMovie, HttpStatus.OK);
	}
	
	@RequestMapping(value="/users",method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<User>> getUsers(){
		Collection<User> list = movieService.finAllUsers();
		return new ResponseEntity<Collection<User>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value="/averangeRating/{movieId}",method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Float averangeRating(@RequestParam(value="movieId", defaultValue="1") Long movieId){
		Float averangeRating = movieService.getAverangeRating(movieId);
		return averangeRating;
	}
	
	@RequestMapping(value="/topTwentyMovies/{state}",method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Collection<Movie> averangeRating(@RequestParam(value="state", defaultValue="California")  String state){
		Collection<Movie> list = movieService.getTop20Movies(state);
		return list;
	}
	
	@RequestMapping(value="/topFiveMovies/{genre}/{idUser}",method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Collection<Movie> topFiveMovies(@RequestParam(value="genre",  defaultValue="Action")  String genre,
			                               @RequestParam(value="idUser", defaultValue="1")       Long idUser) {
		Collection<Movie> list = movieService.getTop5(genre, idUser);
		return list;
	}
	
	@ApiOperation(value="getMovies", nickname="getMovies")
	@RequestMapping(value="/movies",method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Movie>> getMovies(){
		Collection<Movie> list = movieService.findAll();
		return new ResponseEntity<Collection<Movie>>(list, HttpStatus.OK);
	}
	
}
