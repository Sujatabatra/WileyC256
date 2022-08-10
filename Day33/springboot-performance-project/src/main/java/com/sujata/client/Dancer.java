package com.sujata.client;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Aishwarya")
public class Dancer implements Performer,BeanNameAware {

	private String style;
	private String dancerName;

	@Value("Hip Hop")
	public void setStyle(String style) {
		this.style = style;
	}

	@Override
	public void perform() {
		System.out.println(dancerName+" is dancing in "+style+" dance form!");

	}

	@Override
	public void setBeanName(String name) {
		dancerName=name;
		
	}

}
