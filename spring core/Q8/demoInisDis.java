package com.example.springassignmentQ8;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class demoInisDis  implements InitializingBean, DisposableBean {

	
	String msg;
	
	public demoInisDis(String msg) {
		super();
		this.msg = msg;
	}
	
	demoInisDis(){
		
	}
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
	System.out.println("i am in InitializingBean..........After setting the all the properties this method excutes:"+msg);
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("I am in DisposableBean.........This method destroy the beans");
	}

	

	

}
