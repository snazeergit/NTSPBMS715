package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "com.nt")
@ImportResource(locations = { "com/nt/cfgs/applicationContext.xml", "com/nt/cfgs/service-beans.xml",
		"com/nt/cfgs/persistance-beans.xml", "com/nt/cfgs/controller-beans.xml" })

public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig:: 0-param Constructure");
	}
}
