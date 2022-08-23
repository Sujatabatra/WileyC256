package com.sujata.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDetails {

	private String userId;
	private String movieName;
	private int rating;
}
