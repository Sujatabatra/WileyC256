package com.sujata.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.producer.Dancer;
import com.sujata.producer.Drum;
import com.sujata.producer.Guitar;
import com.sujata.producer.Instrumentalist;
import com.sujata.producer.Juggler;
import com.sujata.producer.Singer;
import com.sujata.producer.Tabla;


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
	
	@Bean
	public Guitar guitar() {
		return new Guitar();
	}
	
	@Bean
	public Drum drum() {
		return new Drum();
	}
	
	@Bean
	public Tabla tabla() {
		return new Tabla();
	}
	
	@Bean
	public Instrumentalist Tejaswini() {
		return new Instrumentalist(guitar());
	}
}
