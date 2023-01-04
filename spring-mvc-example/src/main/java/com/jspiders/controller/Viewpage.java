package com.jspiders.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jspiders.controller1.TestService;

@Controller
@RequestMapping(value="/hello")
public class Viewpage {

	public Viewpage()
 {
	 System.out.println("I am hello Controller");
 }
	@Autowired
	private TestService test;
	
	
	@RequestMapping(value="/hw")
	public ModelAndView india()
	{
		System.out.println("User page requested");
		ModelAndView model=new ModelAndView();
		model.setViewName("maxi");
		return model;
	}
	
	@RequestMapping(value="/areu")
/*	public ModelAndView india1(@RequestParam("userName") String name,@RequestParam("password") String password)  */
	public ModelAndView india1(@RequestParam Map<String, String> data)
	
	{
		ModelAndView model= new ModelAndView();
		String userName= data.get("userName");
		String password=data.get("password");
		String email= data.get("email");
		if(!userName.equals("siddu"))
		{
			model.addObject("msg", "invalid userName");
		}
		else if(!password.equals("siddu456"))
		{
			model.addObject("msg","invalid password");
		}
		else if(!(email.contains("@") && (email.contains("."))))
		{
			model.addObject("msg","invalid email-id");
		}

		else
		{
			model.addObject("user", userName);
			model.addObject("pass", password);
			model.addObject("email", email);
		}
		model.setViewName("home");
		return model;
	}

		
	}
	
	
	/*
	 
	 {
	 
		System.out.println("submit method has been called");
		ModelAndView model=new ModelAndView();
		 int a=0,b=0;
		 String e = data.get("email");
		 for(int i=0;i<e.length();i++)
		 {
			 if(e.charAt(i)=='@')
			 {
				 a++;
			 }
			 if(e.charAt(i)=='.')
			 {
				 b++;
			 }
			 
		 }
		 if(a==1 && b==1 && data.get("password").equals("camlin"))
		 {
			 model.setViewName("home");
			 model.addObject("user", data.get("userName"));
			 model.addObject("pass",data.get("password"));
			 model.addObject("siddu", data.get("email"));
		 		return model;
		 }
		 else
		 {
			 model.setViewName("home");
			 model.addObject("msg","You are Unauthorized");
			 return model;
		 }
	 }
	} */
	
	
	/*	if(data.get("password").equals("camlin"))
		{
			model.addObject("user",data.get("userName"));
			model.addObject("pass",data.get("password"));
		}
		else
		{
			model.addObject("msg","user is unauthorized");
		}
		
		model.setViewName("home");
		return model;
}
}*/