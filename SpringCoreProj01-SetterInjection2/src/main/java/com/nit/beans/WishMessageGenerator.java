package com.nit.beans;

public class WishMessageGenerator {

	private MyDate date;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}

	public void setDate(MyDate date) {
		this.date = date;
		System.out.println("WishMessageGenerator.setDate()");
	}

	public String generateWishMessage() {
		System.out.println("Current Date: " + date.printCurrentDate());
		return "Welcome to Spring World..!";
	}

}
