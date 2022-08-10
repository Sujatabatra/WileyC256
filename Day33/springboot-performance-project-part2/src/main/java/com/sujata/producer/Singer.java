package com.sujata.producer;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Setter;

@Component("Vipul")
public class Singer implements Performer,BeanNameAware {
	
	private String song;
	private String singerName;

	public Singer(){
		
	}
	
	public Singer(@Value("Main Zindagi Ka Saath Nibhata Chala Gaya")String song) {
		this.song=song;
	}
	
	public void setSong(String song) {
		this.song = song;
	}

	@Override
	public void perform() {
		System.out.println(singerName+" is singing "+song+"......");

	}

	@Override
	public void setBeanName(String name) {
		this.singerName=name;
		
	}

}
