package com.sujata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.model.service.MessageService;

@Controller
public class MessageController {

	@Autowired
	private MessageService messageService;
	
	@RequestMapping("/message")
	public ModelAndView firstController() {
		ModelAndView modelAndView=new ModelAndView();

		String msg=messageService.getMessage();
		
		modelAndView.addObject("message", msg);
		modelAndView.setViewName("messageView");
		
		return modelAndView;
	}
	
	@RequestMapping("/second")
	public ModelAndView secondController() {
		ModelAndView modelAndView=new ModelAndView();

		String msg=messageService.getMessage()+" from second Controller";
		
		modelAndView.addObject("message", msg);
		modelAndView.setViewName("messageView");
		
		return modelAndView;
	}
}
