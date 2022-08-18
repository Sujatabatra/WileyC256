package com.sujata.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.service.Greet;

@RestController
public class GreetResource {

	@Autowired
	private Greet greet;
	
//	@RequestMapping(path = "/greet",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
	@GetMapping(path = "/greet",produces = MediaType.TEXT_PLAIN_VALUE)
	public String welcomeResource() {
		return "<H1>"+greet.wish()+"</H1>";
	}
	
	@RequestMapping(path = "/wish",method = RequestMethod.GET,produces = MediaType.TEXT_HTML_VALUE)
	public String wishResource() {
		return "<H1>"+greet.wish()+"</H1>";
	}
}
