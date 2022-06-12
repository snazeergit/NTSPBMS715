package com.nt.comps;

public final class FirstFlight implements Courier {
	public FirstFlight() {
		System.out.println("FirstFlight:: Zero-param constructor");
	}

	@Override
	public String deliver(int orderId) {
		return orderId+" order has been assigned to FirstFlight for Delivery";
	}

}
