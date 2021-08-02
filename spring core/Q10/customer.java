package com.example.springassignmentQ10;

import org.springframework.stereotype.Component;

@Component
public class customer {
	String name;
	String add;
	
	public customer(String name, String add) {
		super();
		this.name = name;
		this.add = add;
	}
	public customer() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	public void display() {
		System.out.println("i am in display of customer class....\nName is:"+name+"\naddress is:"+add);
	}

}
