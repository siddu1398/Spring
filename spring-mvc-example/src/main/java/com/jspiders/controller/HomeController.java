package com.jspiders.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jspiders.model.User;

@Controller
@RequestMapping(value="/semifinals")
public class HomeController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	public HomeController()
	{
		System.out.println("I am home controller");
	}
	
	
	@RequestMapping(value = "/welcome")
	public ModelAndView user() {
		System.out.println("User Page Requested");
		ModelAndView model= new ModelAndView();
		model.setViewName("home");
		model.addObject("msg","hello , machha hw r u? Welcome to SPRING MVC anyway.");
		return model;
	}
		@RequestMapping(value = "/avengers")
		public ModelAndView user1() {
			System.out.println("User Page Requested");
			ModelAndView model1= new ModelAndView();
			model1.setViewName("home");
			model1.addObject("msg","hello , avengers assemble");
			return model1;
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
