package com.sujata.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.MovieDetails;
import com.sujata.bean.MovieRatingList;
import com.sujata.service.MovieRatingService;

@RestController
public class MovieDetailsResource {

	@Autowired
	private MovieRatingService movieRatingService;
	
	@GetMapping(path = "details/{uId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public MovieRatingList getMovieRating(@PathVariable("uId") String userId) {
		return new MovieRatingList( movieRatingService.getMovieDetails(userId));
	}
}
