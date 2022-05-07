package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("emp")
//@PropertySource("classpath:com/nt/commons/info.properties")
//<context:property-placeholder> been used in spring bean cfg file instead of @PropertySource
public final class Employee {

	//User defined properties hence need to be specified in Properties file.
	@Value("${emp.id}")
	private Integer id;

	@Value("${emp.name}")
	private String name;

	@Value("${emp.addrs}")
	private String addrs;

	//Predefined System properties, hence available by default not available in properties file.
	@Value("${os.name}")
	private String os;

	@Value("${os.version}")
	private String version;

	@Value("${user.name}")
	private String user;

	@Value("${Path}") //capital 'P' in Path
	private String path;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addrs=" + addrs + ", os=" + os + ", version=" + version
				+ ", user=" + user + ", path=" + path + "]";
	}

}
