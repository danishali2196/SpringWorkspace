package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class FlipKart {
	@Autowired
	public Courier courier;
	//@Resource(name="dtdc")
	
	public final String shopping(String item[]) {
		float billAmt=0.0f;
		int orderId=0;
		billAmt=item.length*1000;
		orderId=new Random().nextInt(1000);
		System.out.println(courier.delevery(orderId));
		return "flipKart order items::"+Arrays.toString(item)+" OrderID ::"+orderId+" Total Pay Amount::"+billAmt;
	}

	

}
