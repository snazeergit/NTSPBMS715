package com.nt.comps;

import org.springframework.context.annotation.Primary;

@Primary //Also configured in cfg file as primary in <bean> tag
public final class BlueDart implements Courier {
	public BlueDart() {
		System.out.println("BlueDart:: Zero-param constructor");
	}

	@Override
	public String deliver(int orderId) {
		// TODO Auto-generated method stub
		return orderId+" order has been assigned to BlueDart for Delivery";
	}

}
