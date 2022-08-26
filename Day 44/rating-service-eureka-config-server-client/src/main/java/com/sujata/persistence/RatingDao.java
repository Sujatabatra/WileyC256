package com.sujata.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Rating;

@Repository
public interface RatingDao extends JpaRepository<Rating, Integer> {

	
	List<Rating> findByUserId(String userId);
}
