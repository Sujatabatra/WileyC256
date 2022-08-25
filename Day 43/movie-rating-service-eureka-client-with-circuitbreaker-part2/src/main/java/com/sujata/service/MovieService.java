package com.sujata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sujata.bean.Movie;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class MovieService {

	@Autowired
	private RestTemplate restTemplate;
	
	@CircuitBreaker(name = "movie",fallbackMethod ="getMovieFallBack" )
	public Movie getMovie(String movieId) {
		return restTemplate.getForObject("http://movie-service/movies/"+movieId, Movie.class);
	}
	
	public Movie getMovieFallBack(Exception e) {
		return new Movie(null,"No Movie Name");
	}
}
