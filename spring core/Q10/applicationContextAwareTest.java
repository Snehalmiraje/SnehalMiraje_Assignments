package com.example.springassignmentQ10;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class applicationContextAwareTest  implements ApplicationContextAware{
	ApplicationContext c;
	
	public ApplicationContext getContext() {
		return c;
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		
		this.c=applicationContext;
	}

}
