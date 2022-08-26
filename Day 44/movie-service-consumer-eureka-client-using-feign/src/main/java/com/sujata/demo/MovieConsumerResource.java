package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.Movie;

@RestController
public class MovieConsumerResource {

	@Autowired
	private MovieService movieService;
	
	@GetMapping(path = "/details/{movieId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Movie getMovieByIdResource(@PathVariable("movieId") String movieId) {
		return movieService.getMovie(movieId);
	}
}
