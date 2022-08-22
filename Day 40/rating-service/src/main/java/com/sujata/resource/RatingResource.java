package com.sujata.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.RatingList;
import com.sujata.service.RatingService;

@RestController
public class RatingResource {

	@Autowired
	private RatingService ratingService;
	
	@GetMapping(path = "rating/{uId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public RatingList getRatingListResource(@PathVariable("uId") String userId) {
		return ratingService.getRatings(userId);
	}
}
