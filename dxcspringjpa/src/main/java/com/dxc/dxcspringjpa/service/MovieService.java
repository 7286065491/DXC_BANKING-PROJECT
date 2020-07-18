package com.dxc.dxcspringjpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.dxc.dxcspringjpa.dao.MovieDao;
import com.dxc.dxcspringjpa.entity.Movie;

public class MovieService 
{
	   
		@Autowired(required=true)
		
		MovieDao moviedao;
		
		public List<Movie> getMovies() {
			return this.moviedao.findAll();
		}
		
		public Movie addMovie(Movie movie) {
			return this.moviedao.save(movie);
		}
		
		// Optional is a Container object which may or may not contain non null values
		public Optional <Movie> optional(int id ) {
			return this.moviedao.findById(id);
		}
		
		public Movie updateMovie(Movie movie) {
			return this.moviedao.save(movie);
		}
		
		public Movie deleteMovieById(Object id) {
			this.moviedao.deleteById((Integer) id);
			return null;
		}
		
		public void deleteAllM() {
			this.moviedao.deleteAll();
		}

		public void deleteAllMovies() {
			// TODO Auto-generated method stub
			
		}
	}


