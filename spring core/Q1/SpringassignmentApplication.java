package com.example.springassignmentQ1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringassignmentApplication {

	public static void main(String[] args) {
		
		/*ApplicationContext app=SpringApplication.run(SpringassignmentApplication.class, args);
		customer c=app.getBean(customer.class);
		System.out.println(c.toString());*/
		
		ApplicationContext app= new ClassPathXmlApplicationContext("app.xml");
		customer c=app.getBean(customer.class);
		System.out.println(c.toString());
	}

}
