package com.example.springassignmentQ6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("unused")
@SpringBootApplication
@PropertySource("classpath:application.properties")
public class SpringassignmentApplicationQ6 {

	public static void main(String[] args) {
		
	
		@SuppressWarnings("resource")
		ApplicationContext app= new AnnotationConfigApplicationContext(SpringassignmentApplicationQ6.class);
		
		ReadingFromExternalfile readExternal=app.getBean(ReadingFromExternalfile.class);
		System.out.println(readExternal);
		readExternal.displayinfo();
}
}
