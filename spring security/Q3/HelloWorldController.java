package com.springsecurity.demo.springSecurityExmaple.Q2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/")
	public String demo() {
		return "Hellooo All...!";
	}
}
