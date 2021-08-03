package com.example.springassignmentQ9;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class initdcleanxml {
	String msg;
	
	public initdcleanxml(String msg) {
		super();
		this.msg = msg;
	}
	initdcleanxml(){
		
	}
	

	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("I am in init");
		}
	@PreDestroy
	public void cleanup() {
		System.out.println("i am in cleanup menthod..");
	}	

}
