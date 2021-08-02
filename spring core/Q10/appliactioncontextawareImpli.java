package com.example.springassignmentQ10;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SpringBootApplication
public class appliactioncontextawareImpli{

	public static void main(String[] args) {

		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("app.xml");
		applicationContextAwareTest appcontext= (applicationContextAwareTest)context.getBean("app");
		ApplicationContext appCon =appcontext.getContext();
		customer a= (customer)appCon.getBean("cust");
		a.display();
	
		
		

	}

	
}
