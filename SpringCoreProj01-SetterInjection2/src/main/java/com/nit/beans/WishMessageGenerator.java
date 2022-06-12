package com.nit.beans;

import java.util.Date;

public class WishMessageGenerator {

	private Date date;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}

	public void setDate(Date date) {
		this.date = date;
		System.out.println("WishMessageGenerator.setDate()");
	}
	
	@SuppressWarnings("deprecation")
	public String generateWishMessage() {
		int hours = date.getHours();
		String msg = null;
		if (hours<12 && hours>6) {
			return msg="Good Morning";
		}else if (hours>12 && hours<18) {
			return msg="Good Afternoon";
		}else if (hours>18) {
			return msg="Good Evening";
		}
		return msg; 
	}

}
