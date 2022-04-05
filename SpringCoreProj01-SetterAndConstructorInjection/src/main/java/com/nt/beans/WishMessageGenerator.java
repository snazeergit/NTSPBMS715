package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;

	public WishMessageGenerator(Date date) {
			this.date = date;
			System.out.println("WishMessageGenerator.WishMessageGenerator(Date)"+date);
	}
	
	public void setDate(Date date) {
		this.date=date;
		System.out.println("WishMessageGenerator.setDate(Date)"+date);
	}
	
	public String generateWishMessage() {
		@SuppressWarnings("deprecation")
		int hours = date.getHours();
		if(hours<12&& hours >6)
			return "Good Morning";
		else if (hours>12&& hours<18)
			return "Good Afternoon";
		else if (hours>18&& hours<20) 
				return "Good Evening";
		else
			return "Good Night";
	}

}
