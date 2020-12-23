package com.codeAlong.SpringDemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	// controller method to show the initial html form
	@RequestMapping("/showForm")
	 public String showForm() {
		 return "helloworld-form";
	 }
	
	//controller method to process the html form data
	@RequestMapping("/processForm")
	 public String processForm() {
		 return "helloworld";
	 }
	
	//new controller method to read the form data
	// add data to the model 
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		//read the request Parameter from the html form
		String theName = request.getParameter("studentName");
		
		//convert the data into all caps
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Yo! "+theName;
		
		//add message to the model
		model.addAttribute("message",result);
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		
		//convert the data into all caps
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Namaste! "+theName;
		
		//add message to the model
		model.addAttribute("message",result);
		return "helloworld";
	}
}
