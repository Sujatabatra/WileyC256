package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Chitranshu")
public class Singer implements Performer {

	private String song;
	
	
	@Value("Yun Hi Chala Chal")
	public void setSong(String song) {
		this.song = song;
	}


	@Override
	public void perform() {
		System.out.println("Singer is singing "+song);

	}

}
