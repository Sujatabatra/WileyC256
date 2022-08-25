package com.sujata.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sujata.bean.Rating;
import com.sujata.bean.RatingList;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class RatingService {

	@Autowired
	private RestTemplate restTemplate;
	
	@CircuitBreaker(name = "rating",fallbackMethod ="getRatingListFallBack" )
	public RatingList getRatingList(String userId) {
		return restTemplate.getForObject("http://rating-service/rating/"+userId, RatingList.class);
	}
	
	public RatingList getRatingListFallBack(Exception e) {
		List<Rating> ratings=new ArrayList<Rating>();
		ratings.add(new Rating(0, null, 0, null));
		return new RatingList(ratings);
	}
}
