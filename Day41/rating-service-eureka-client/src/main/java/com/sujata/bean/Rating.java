package com.sujata.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Rating {

	@Id
	private int ratingId;
	private String movieId;
	private int rating;
	private String userId;
	
}
