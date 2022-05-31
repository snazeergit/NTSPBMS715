package com.nt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "com/nt/commons/jdbc.properties")
@ImportResource(value = "com/nt/cfgs/applicationContext.xml")
@Import(value = { ServiceConfig.class, ControllerConfig.class, PersistanceConfig.class })
public class AppConfig {

}
