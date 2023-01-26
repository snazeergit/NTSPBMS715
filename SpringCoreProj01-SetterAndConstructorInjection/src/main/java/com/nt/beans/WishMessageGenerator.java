package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;

	public WishMessageGenerator(Date date) {
		this.date = date;
		System.out.println("Constructor Injection Performed:: " + date);
	}

	public void setDate(Date date) {
		this.date = date;
		System.out.println("Setter Injection Performed:: " + date);
	}

	public String generateWishMessage() {
		System.out.println("Finally date property has been injected with value:: " + date);//setter injection overrides the constructor injection date property value.
		@SuppressWarnings("deprecation")
		int hours = date.getHours();
		if (hours < 12 && hours > 6)
			return "Good Morning";
		else if (hours > 12 && hours < 18)
			return "Good Afternoon";
		else if (hours > 18 && hours < 20)
			return "Good Evening";
		else
			return "Good Night";
	}

}
