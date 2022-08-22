package com.sujata.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.Movie;
import com.sujata.service.MovieService;

@RestController
public class MovieResource {

	@Autowired
	private MovieService movieService;
	
	
	@GetMapping(path = "/movies/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Movie getMovieResource(@PathVariable("id") String movieId) {
		return movieService.getMovie(movieId);
	}
}
