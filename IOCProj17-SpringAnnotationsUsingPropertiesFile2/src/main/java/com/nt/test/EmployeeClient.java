package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import com.nt.beans.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		Employee employee = ctx.getBean("emp", Employee.class);
		ConfigurableEnvironment environment = ctx.getEnvironment();

		System.out.println("Employee details : " + employee);

		System.out.println("Employee ID : " + environment.getProperty("emp.id"));
		System.out.println("Employee Name : " + environment.getProperty("emp.name"));
		System.out.println("Employee Addrs : " + environment.getProperty("emp.addrs"));
		System.out.println("Employee DOB : " + ctx.getBean("dt", java.util.Date.class));
	}

}
