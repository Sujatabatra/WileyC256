package com.sujata.producer;

import org.springframework.stereotype.Component;

@Component
public class Drum implements Instrument {

	@Override
	public void play() {
		System.out.println("DUM DUM DUM!");

	}

}
