package com.nt.comps;

public final class FedEx implements Courier {
	public FedEx() {
		System.out.println("FirstFlight:: Zero-param constructor");
	}

	@Override
	public String deliver(int orderId) {
		// TODO Auto-generated method stub
		return orderId+" order has been assigned to FedEx for Delivery";
	}

}
