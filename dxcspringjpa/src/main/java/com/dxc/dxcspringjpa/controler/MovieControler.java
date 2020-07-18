package com.dxc.dxcspringjpa.controler;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.dxcspringjpa.entity.Movie;
import com.dxc.dxcspringjpa.service.MovieService;




@RestController
@RequestMapping("/movie")
public class MovieControler {
  
	@Autowired
	
	MovieService movieservice;
	
	 @Bean
	@RequestMapping(name="/getMovieById", method=RequestMethod.GET)
	public List<Movie> getMovie(@PathVariable int id){
		return this.movieservice.getMovies();
	}
	@RequestMapping(name="/addMovie", method=RequestMethod.POST)
	public Movie addMovie(@RequestBody Movie movie){
		return this.movieservice.addMovie(movie);
	}
	@RequestMapping(name="/updateMovieById", method=RequestMethod.PUT)
	public Movie updateMovieById(@RequestBody Movie movie){
		return this.movieservice.updateMovie(movie);
	}
	@RequestMapping(name="/deleteMovieById", method=RequestMethod.DELETE)
	public Movie deleteMovieById(@RequestBody Movie movie){
		Object id = null;
		return this.movieservice.deleteMovieById(id);
	}
	@RequestMapping(name="/deleteAllMovies", method=RequestMethod.DELETE)
	public void DeleteAllMovies() {
		this.movieservice.deleteAllMovies();
	}
	@RequestMapping(name="/All", method=RequestMethod.GET)
	public List<Movie> getAllMovies(){
		return this.movieservice.getMovies();
	}
	
	
}
