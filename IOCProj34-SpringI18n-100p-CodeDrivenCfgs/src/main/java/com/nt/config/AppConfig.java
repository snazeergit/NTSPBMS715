package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {

	@Bean("messageSource")
	public ResourceBundleMessageSource createRBMS() {
		System.out.println("AppConfig.createRBMS()");
		ResourceBundleMessageSource msrb = new ResourceBundleMessageSource();
		msrb.setBasename("com/nt/commons/App");
		return msrb;
	}

}
