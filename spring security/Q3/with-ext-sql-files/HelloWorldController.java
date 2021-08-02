package com.Springsecurity.Jdbc.springsecurityJdbc.sqlfile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/")
	public String demo() {
		return "Hellooo All...!";
	}
	
	@GetMapping("/user")
	public String user() {
		return "Hello User...!";
		
	}

	
	@GetMapping("/admin")
	public String admin() {
		return "Hello Admin...!";
		
	}

}
