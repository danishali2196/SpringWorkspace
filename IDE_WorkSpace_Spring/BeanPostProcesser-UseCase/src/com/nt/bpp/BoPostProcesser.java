package com.nt.bpp;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.nt.bo.BaseBO;

public class BoPostProcesser implements BeanPostProcessor {

	public BoPostProcesser() {
		System.out.println("BoPostProcesser::0-paramConstructor");
	}
	
	public Object postProcessBeforeInitialization(Object bean,String bid) throws BeansException {
		System.out.println("BoPostProcesser.postProcessBeforeInitialization(-,-)");
		if(bean instanceof BaseBO) {
			((BaseBO) bean).setDoj(new Date());
			return bean;
		}
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean,String bid) throws BeansException {
		System.out.println("BoPostProcesser.postProcessAfterInitialization(-,-)");
		
	return bean;
	
	}
	

	

}
