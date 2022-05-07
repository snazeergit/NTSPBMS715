package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("emp")
@PropertySource("classpath:com/nt/commons/info.properties")
public final class Employee {
	
	@Value("${emp.id}")
	private Integer id;
	
	@Value("${emp.name}")
	private String name;
	
	@Value("${emp.addrs}")
	private String addrs;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addrs=" + addrs + "]";
	}

	

}
