package com.nt.comps;

public final class DTDC implements Courier{

	public DTDC() {
		System.out.println("DTDC:: Zero-param Constructor");
	}
	
	@Override
	public String deliver(int orderId) {
		// TODO Auto-generated method stub
		return orderId+" order has been assigned to DTDC for Delivery";
	} 

}
