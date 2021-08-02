package com.example.springassignmentQ8;

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
		System.out.println("i am in Init using @postConstruct..........After setting the all the properties this method excutes:"+msg);
		}
	@PreDestroy
	public void cleanup() {
		System.out.println("i am in cleanup menthod...using @predestroy");
	}	

}
