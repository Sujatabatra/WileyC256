package com.sujata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.producer.Dancer;
import com.sujata.producer.Juggler;
import com.sujata.producer.Singer;

@Configuration
public class PerformerConfiguration {

	@Bean
	public Singer Chitranshu() {
		Singer singer=new Singer();
		singer.setSong("Yun Hi Chala Chal");
		return singer;
	}
	
	@Bean(name = "Krishna")
	public Juggler getJuggler() {
		return new Juggler(4);
	}
	
	@Bean(name="Vivek")
	public Dancer getDancer() {
		Dancer dancer=new Dancer();
		dancer.setStyle("Salsa");
		return dancer;
	}
}
