package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Vivek")
public class Dancer implements Performer {

	private String style;

	public void setStyle(@Value("Salsa") String style) {
		this.style = style;
	}

	@Override
	public void perform() {
		System.out.println("Dancer is dancing in "+style+" Style!");

	}

}
