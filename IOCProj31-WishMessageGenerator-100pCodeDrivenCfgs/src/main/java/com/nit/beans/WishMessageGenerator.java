package com.nit.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	@Autowired
	private LocalDateTime ltd;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}

	public String generateWishMessage(String user) {
		int hours = ltd.getHour();
		if (hours < 12) {
			return "Good Morning " + user;
		} else if (hours < 16) {
			return "Good Afternoon " + user;
		} else if (hours < 20) {
			return "Good Evening " + user;
		} else {
			return "Good night " + user;
		}

	}

}
