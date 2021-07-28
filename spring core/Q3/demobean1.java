package com.example.springassignmentQ5;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class demobean1 {
	
	@Resource
	 private demobean2 beanTwo;
		
	public void setBeanTwo(demobean2 beanTwo) {
		this.beanTwo = beanTwo;
	}
		
	 public demobean2 getBeanTwo() {
		return beanTwo;
	}


	public void print(){
		   System.out.println("i am in demobaen1...!");
	      beanTwo.print();
	   }
}