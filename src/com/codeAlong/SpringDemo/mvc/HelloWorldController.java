package com.codeAlong.SpringDemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
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
}
