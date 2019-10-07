package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyWebContainer implements ApplicationContextAware {
	
	private String beanid;
	ApplicationContext ctx;
	
	public void setBeanid(String beanid) {
		this.beanid = beanid;
	}

	private ResquestHandler handler;
	int count;
	public MyWebContainer() {
		count++;
		System.out.println("MyWebContainer::0-param constructor"+count);
	}
	
	
	
	public void processRequest(String data) {
		handler=ctx.getBean(beanid,ResquestHandler.class);
		handler.hander(data);
	}

	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;
		
	}
	
	

}
