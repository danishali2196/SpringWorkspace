package com.nt.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dtdc")
@Primary
public class DTDC implements Courier {

	@Override
	public String delevery(int orderId) {
		return "DTDC Delevering order order id::"+orderId;
	}

}
