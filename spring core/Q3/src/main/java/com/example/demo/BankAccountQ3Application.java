package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BankAccountQ3Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		BankAccountRepositoryImpl BankAccountRepositoryImpl = context.getBean(BankAccountRepositoryImpl.class);
	
		
		System.out.println(  BankAccountRepositoryImpl.getBalance(1));
		//SpringApplication.run(BankAccountQ3Application.class, args);
	}

}
