package com.sujata.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.model.service.CalculatorService;

@Controller
public class CalculatorController {

	@Autowired
	private CalculatorService calculatorService;
	
	@RequestMapping("/")
	public ModelAndView welcomePageController() {
		return new ModelAndView("InputValuesPage");
	}
	
	@RequestMapping("/sum")
	public ModelAndView sumController(HttpServletRequest request) {
		ModelAndView modelAndView=new ModelAndView();
		
		String no1=request.getParameter("num1");
		String no2=request.getParameter("num2");
		String op=request.getParameter("operator");
		
		int result=0;
		String resultMessage="";
		switch(op){
		case "Sum":
			result=calculatorService.sum(Integer.parseInt(no1),Integer.parseInt(no2));
			resultMessage="Addition";
			break;
		case "Minus":
			result=calculatorService.minus(Integer.parseInt(no1),Integer.parseInt(no2));
			resultMessage="Difference";
			break;
		case "Multiply":
			result=calculatorService.multiply(Integer.parseInt(no1),Integer.parseInt(no2));
			resultMessage="Product";
			break;
		case "Divide":
			result=calculatorService.divide(Integer.parseInt(no1),Integer.parseInt(no2));
			resultMessage="Quotient";
			break;
			
		}
		
		
		modelAndView.addObject("result", result);
		modelAndView.addObject("message",resultMessage);
		modelAndView.setViewName("Output");
		
		return modelAndView;
	}
}
