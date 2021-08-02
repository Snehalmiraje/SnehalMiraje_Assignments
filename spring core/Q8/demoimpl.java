package com.example.springassignmentQ8;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SpringBootApplication
public class demoimpl {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = 
	            new ClassPathXmlApplicationContext("app.xml");
	    
		demoInisDis d=context.getBean(demoInisDis.class);
	    	
	    System.out.println(d);
	    	
	    initdcleanxml i=context.getBean(initdcleanxml.class);
	    System.out.println(i);
	    
	    	context.close();

	}

}
