package com.sujata.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sujata.bean.Movie;

@FeignClient("movie-service")
public interface MovieService {

	@GetMapping(path="/movies/{movieId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Movie getMovie(@PathVariable("movieId") String movieId);
}
