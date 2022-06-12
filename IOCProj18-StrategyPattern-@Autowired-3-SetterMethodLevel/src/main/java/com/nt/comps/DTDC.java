package com.nt.comps;

public final class DTDC implements Courier{

	public DTDC() {
		System.out.println("DTDC:: Zero-param Constructor");
	}
	
	@Override
	public String deliver(int orderId) {
		return orderId+" order has been assigned to DTDC for Delivery";
	} 

}
