package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	//need controller method to show initial form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//need controller method to process the form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//new controller method to read data from form
	//and add data to model
	@RequestMapping("/processFormVersionTwo")
	public String letsShout(HttpServletRequest request, Model model) {
		//Read the request parameter from HTML form
		String userName = request.getParameter("studentName");
		//convert to all CAPS
		userName = userName.toUpperCase();
		//create the message
		String result = "Yo! My Buddy " + userName;
		//Add message to model
		model.addAttribute("message", result);
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String letsShoutDifferently(@RequestParam("studentName") String userName, Model model) {
		//convert to all CAPS
		userName = userName.toUpperCase();
		//create the message
		String result = "Hey! My Friend " + userName;
		//Add message to model
		model.addAttribute("message", result);
		return "helloworld";
	}

}
