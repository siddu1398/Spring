package com.jspiders.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/hii")
public class SpringAssignment 
{

 HashMap<String,String> h1 = new HashMap<String,String>();
 
 
 public SpringAssignment()
 {
	 System.out.println("I am hello Controller");
 }
 @RequestMapping(value="/welcome")
 public ModelAndView machha()
 {
	 ModelAndView model=new ModelAndView();
	 model.setViewName("virat");
	
	 return model;
 }
 @RequestMapping("submit")
 public ModelAndView some(@RequestParam Map<String,String> data)
 {
	 h1.put("userName","siddu");
	 h1.put("password","siddu456");
	 h1.put("email","siddu@gmail.com");
	 
	 h1.put("userName","suhas");
	 h1.put("password","suhas456");
	 h1.put("email","suhas@gmail.com");
	 
	 h1.put("userName","srisha");
	 h1.put("password","srisha456");
	 h1.put("email","srisha@gmail.com");
	 
	 ModelAndView model = new ModelAndView();
	
	 if(!(data.get("userName").equals(h1.get("userName"))))
	 	{
		 	model.setViewName("home");
		 	model.addObject("msg","UserName is Incorrect");
		 	return model;
		 }
	 if(!(data.get("password").equals(h1.get("password"))))
	 {
		 model.setViewName("home");
		 model.addObject("siddu","Username is Correct");
		 model.addObject("msg","Password is Incorrect");
		 return model;
	 }
	 if(!(data.get("email").equals(h1.get("email"))))
	 {
		 model.setViewName("home");
		 model.addObject("msg","Email Id is Incorrect");
		 model.addObject("siddu","UserName and Password is Correct");
		 return model;
		 
	 }
	 if((data.get("email").equals(h1.get("email"))) && data.get("password").equals(h1.get("password")) && data.get("userName").equals(h1.get("userName")))
	 {
		 model.setViewName("home");
		 model.addObject("user", data.get("userName"));
		 model.addObject("pass",data.get("password"));
		 model.addObject("email", data.get("email"));
	 		return model;
	 }
	 else
	 {
		 model.setViewName("home");
		 model.addObject("msg","User is Unauthorized");
		 return model;
	 }
	 
 }
}