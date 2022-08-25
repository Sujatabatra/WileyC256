package com.sujata.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sujata.bean.Movie;
import com.sujata.bean.MovieDetails;
import com.sujata.bean.Rating;
import com.sujata.bean.RatingList;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class MovieRatingServiceImpl implements MovieRatingService {

//	@Autowired
//	private RestTemplate restTemplate;
	
	@Autowired
	private MovieService movieService;
	@Autowired
	private RatingService ratingService;
	@Override
//	@CircuitBreaker(name = "movieDetails",fallbackMethod ="getMovieDetailsFallBack" )
	public List<MovieDetails> getMovieDetails(String userId) {
		List<MovieDetails> movieDetailsList=new ArrayList<MovieDetails>();
		
//		RatingList ratingList=restTemplate.getForObject("http://rating-service/rating/"+userId, RatingList.class);
		RatingList ratingList=ratingService.getRatingList(userId);
		
		for(Rating rating:ratingList.getRatings()) {
//			Movie movie=restTemplate.getForObject("http://movie-service/movies/"+rating.getMovieId(), Movie.class);
			Movie movie=movieService.getMovie(rating.getMovieId());
			movieDetailsList.add(new MovieDetails(userId, movie.getMovieName(), rating.getRating()));
		}
		
		return movieDetailsList;
	}
//	@CircuitBreaker(name = "rating",fallbackMethod ="getRatingListFallBack" )
//	public RatingList getRatingList(String userId) {
//		return restTemplate.getForObject("http://rating-service/rating/"+userId, RatingList.class);
//	}
//	
//	public RatingList getRatingListFallBack(Exception e) {
//		List<Rating> ratings=new ArrayList<Rating>();
//		ratings.add(new Rating(0, null, 0, null));
//		return new RatingList(ratings);
//	}
	
//	@CircuitBreaker(name = "movie",fallbackMethod ="getMovieFallBack" )
//	public Movie getMovie(String movieId) {
//		return restTemplate.getForObject("http://movie-service/movies/"+movieId, Movie.class);
//	}
//	
//	public Movie getMovieFallBack(Exception e) {
//		return new Movie(null,"No Movie Name");
//	}
}