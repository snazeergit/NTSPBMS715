package com.nt.test;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyPatternTest {

	public static void main(String[] args) {
		try {
			Flipkart flipkart = FlipkartFactory.getInstance();
			String resultMsg = flipkart.shopping(new String[] { "candles", "flowers", "cake", "wine" },
					new double[] { 1000.0, 2000.0, 3000.0, 7000.0 });
			System.out.println(resultMsg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
