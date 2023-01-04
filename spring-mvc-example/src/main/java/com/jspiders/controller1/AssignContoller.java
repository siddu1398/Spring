package com.jspiders.controller1;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/machha")
public class AssignContoller 
{
	 static HashMap<String,Customer> h1 = new HashMap<String,Customer>();
	
	
	static
	{
		Customer c1=new Customer("10", "siddu", "siddu456", "siddu@gmail.com");
		Customer c2=new Customer("11", "suhas", "suhas456", "suhas@gmail.com");
		Customer c3=new Customer("12", "srisha", "srisha456", "srisha@gmail.com");
	
		h1.put(c1.getId(),c1);
		h1.put(c2.getId(), c2);
		h1.put(c3.getId(), c3);
	/*	h1.put(c1.getEmail(), c1);*/
		}

	 @RequestMapping(value="/tiffen")
	 public ModelAndView assign()
	 {
		 ModelAndView model=new ModelAndView();
		 model.setViewName("form");
		
		 return model;
	 }
	 
	 @RequestMapping("ayta")
	 public ModelAndView some(@RequestParam Map<String,String> data)
     
	 {
		  ModelAndView model=new ModelAndView();
		 
		 String userid=data.get("id");
		 String userName=data.get("userName");
		 String password=data.get("password");
		 String email=data.get("email");
		
		 Customer cust=h1.get(userid);
		 
		if(h1.containsKey(userid))
		{
			
		/*	if(!(userid.equals(cust.getId())))
			{
				model.setViewName("home");
			 	model.addObject("msg","Userid is Incorrect");
			 	return model;
			}*/
					
			if(!(userName.equals(cust.getName())))
			{
			 	model.addObject("msg1","UserName is Incorrect");
			 	
			}
		
			if(!(password.equals(cust.getPassword())))
			{
			 	model.addObject("msg2","password is Incorrect");
			 	
			}
		
			if(!(email.equals(cust.getEmail())))
			{
			 	model.addObject("msg3","email is Incorrect");
			 	
			}
			else
		     {
			 model.addObject("id",cust.getId());
			 model.addObject("user", cust.getName());
			 model.addObject("pass",cust.getPassword());
			 model.addObject("email", cust.getEmail());
		 		
		}
	}
	 
		else
		 {
			 model.setViewName("home");
			 model.addObject("msg","User is Unauthorized");
			 
		 }
			return model;
   }
}
	/*	Customer cust=h1.get(userid);
		
		if (h1.containsKey(userid)) {
			if (!userName.equals(cust.getName())) {
				model.addObject("msg", "invalid username");
			}
			if (!password.equals(cust.getPassword())) {
				model.addObject("msg", "invalid password");
			}
			if (!email.equals(cust.getEmail())) {
				model.addObject("msg", "invalid email");

			}
			else
			{
				model.addObject("id",userid);
				model.addObject("user",userName);
				model.addObject("pass",password);
				model.addObject("email",email);
			}
		} else {
			model.addObject("siddu", "invalid userid");
		}
		return model;
   }
}
*/

   


		