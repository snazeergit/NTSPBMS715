package com.nit.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nit")
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig:: 0-param constructor");
	}

	@Bean(name = "ldt") //or @Bean(value="ldt") //or @Bean("ldt")
	public LocalDateTime createLocalDateTime() {
		System.out.println("AppConfig.createLocalDateTime()");
		return LocalDateTime.now();
	}
}
