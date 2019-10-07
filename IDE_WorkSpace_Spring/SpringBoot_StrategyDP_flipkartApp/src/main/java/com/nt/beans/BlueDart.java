package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("bd")

public class BlueDart implements Courier {

	@Override
	public String delevery(int orderId) {
		
		return "BlueDart Delevering Order OrderId::"+orderId;
	}

}
