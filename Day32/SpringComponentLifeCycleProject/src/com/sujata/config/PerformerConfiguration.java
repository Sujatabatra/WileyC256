package com.sujata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.producer.Dancer;
import com.sujata.producer.Juggler;
import com.sujata.producer.PerformerInitializations;
import com.sujata.producer.Singer;

@Configuration
public class PerformerConfiguration {

	@Bean(initMethod = "ChitranshuInit",destroyMethod = "chitranshuDestroy")
	public Singer Chitranshu() {
		Singer singer=new Singer();
		singer.setSong("Yun Hi Chala Chal");
		return singer;
	}
	
	@Bean(name="Hamza",initMethod = "HamzaInit",destroyMethod = "hamzaDestroy")
	public Singer getSinger() {
		Singer singer=new Singer();
		singer.setSong("Mere Mehboob Kayamat Hogi!");
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
	
	@Bean
	public PerformerInitializations performerInitializations() {
		return new PerformerInitializations();
	}
}
