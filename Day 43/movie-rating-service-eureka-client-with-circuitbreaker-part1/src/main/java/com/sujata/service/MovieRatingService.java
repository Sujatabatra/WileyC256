package com.sujata.service;

import java.util.List;

import com.sujata.bean.MovieDetails;

public interface MovieRatingService {

	List<MovieDetails> getMovieDetails(String userId);
}
