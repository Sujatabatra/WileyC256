package com.sujata.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@Entity
public class Trainer {

	@Id
	private int trainerId;
	private String trainerName;
//	private List<Student> students;
	
	public Trainer(int trainerId, String trainerName) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
	}
	
	
}
