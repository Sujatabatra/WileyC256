package com.sujata.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sujata.producer.Dancer;
import com.sujata.producer.Drum;
import com.sujata.producer.Guitar;
import com.sujata.producer.Instrumentalist;
import com.sujata.producer.Juggler;
import com.sujata.producer.Singer;
import com.sujata.producer.Tabla;


@Configuration
@ComponentScan(basePackages = "com.sujata.producer")
public class PerformerConfiguration {

	
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
