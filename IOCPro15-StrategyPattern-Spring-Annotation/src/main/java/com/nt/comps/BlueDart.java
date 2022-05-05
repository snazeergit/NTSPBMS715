package com.nt.comps;

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
