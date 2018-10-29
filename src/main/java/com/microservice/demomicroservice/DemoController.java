package com.microservice.demomicroservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {
	
	@GetMapping("/message")
	public String welcomeMessage(){
		return "Hello World";
	}

}
