package com.sujata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.bean.RatingList;
import com.sujata.persistence.RatingDao;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingDao ratingDao;
	
	@Override
	public RatingList getRatings(String userId) {
		return new RatingList(ratingDao.findByUserId(userId));
	}

}
