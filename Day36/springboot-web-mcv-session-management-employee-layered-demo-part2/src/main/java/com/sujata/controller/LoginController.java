package com.sujata.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.bean.User;
import com.sujata.model.service.UserService;

@Controller
//@SessionAttributes({"user"})
public class LoginController {

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public ModelAndView loginPageController() {
		return new ModelAndView("Login", "command", new User());
	}

	@RequestMapping("/login")
	public ModelAndView loginController(@ModelAttribute User user,HttpSession session) {
		
		ModelAndView modelAndView=new ModelAndView();
		if (userService.checkUser(user)) {
			modelAndView.addObject("user", user);  //user object added at request scope
			session.setAttribute("user", user);
			modelAndView.setViewName("index");
		}
		else {
			modelAndView.addObject("message", "Invalid Credentials");
			modelAndView.addObject("command", new User());
			modelAndView.setViewName("Login");
		}
		return modelAndView;
	}
}
