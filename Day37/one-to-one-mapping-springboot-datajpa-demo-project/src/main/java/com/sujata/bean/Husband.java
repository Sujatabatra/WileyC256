package com.sujata.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@Entity
public class Husband {

	@Id
	private String husbandId;
	private String husbandName;
	
	public Husband(String husbandId, String husbandName) {
		super();
		this.husbandId = husbandId;
		this.husbandName = husbandName;
	}
	
	
	
}
