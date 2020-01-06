package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller					//<-- specify the controller
public class HomeController {
	
	@RequestMapping("/")	//<-- Mapping the Request
	public String showPage() {
		return "main-menu";	//<-- View Name
	}

}
