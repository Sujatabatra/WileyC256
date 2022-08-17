package com.sujata.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
	@OneToMany
	private List<Student> students=new ArrayList<Student>();
	
	public Trainer(int trainerId, String trainerName) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
	}
	
	
}
