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

@Service
public class MovieRatingServiceImpl implements MovieRatingService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<MovieDetails> getMovieDetails(String userId) {
		List<MovieDetails> movieDetailsList=new ArrayList<MovieDetails>();
		
		RatingList ratingList=restTemplate.getForObject("http://localhost:8084/rating/"+userId, RatingList.class);
		
		for(Rating rating:ratingList.getRatings()) {
			Movie movie=restTemplate.getForObject("http://localhost:8082/movies/"+rating.getMovieId(), Movie.class);
			movieDetailsList.add(new MovieDetails(userId, movie.getMovieName(), rating.getRating()));
		}
		
		return movieDetailsList;
	}
}