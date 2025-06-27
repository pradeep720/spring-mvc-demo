package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	
	//need a controller method  to show the initial HTML form
	@RequestMapping("/showForm")
	 public String showForm() {
	return  "HelloWorld-Form";	 
	 }
	
	//need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "HelloWorld";
	}
	
	//need a controller method to read form data and
	//add data to model
  	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
	
  		
  		//read the request parameter from html form
  		
  		String theName = request.getParameter("studentName");
  		//convert a data to cap
  		theName = theName.toUpperCase();
  		//create a message
  		String result ="yo! "+theName;
  		//add message to model
  		model.addAttribute("message",result);
  		
		 return "HelloWorld";
	}
  	
  	
  	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree (@RequestParam("studentName") String theName, Model model) {
	
  	
  		//convert a data to cap
  		theName = theName.toUpperCase();
  		//create a message
  		String result ="hey my friend from v3 "+theName;
  		//add message to model
  		model.addAttribute("message",result);
  		
		 return "HelloWorld";
	}
}
