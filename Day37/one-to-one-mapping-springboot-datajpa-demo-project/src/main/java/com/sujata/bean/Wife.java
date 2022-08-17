package com.sujata.bean;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@Entity
public class Wife {

	@Id
	private String wifeId;
	private String wifeName;
//	@OneToOne(fetch = FetchType.LAZY)
	@OneToOne
	private Husband pati;
	
	public Wife(String wifeId, String wifeName) {
		super();
		this.wifeId = wifeId;
		this.wifeName = wifeName;
	}
	
	
}
