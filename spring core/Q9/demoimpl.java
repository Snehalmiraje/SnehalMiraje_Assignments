package com.example.springassignmentQ9;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SpringBootApplication
public class demoimpl {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = 
	            new ClassPathXmlApplicationContext("app.xml");
	    
	    initdcleanxml i=context.getBean(initdcleanxml.class);
	    System.out.println(i);
	    
	    	context.close();

	}

}
