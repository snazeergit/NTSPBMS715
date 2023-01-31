package com.nt.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class CalculateInterestAmountReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("CalculateInterestAmountReplacer.reimplement()");
		double pAmt = (double) args[0];
		double rate = (double) args[1];
		double time = (double) args[2];
		return (pAmt * time * rate) / 100.0f;
	}

}
