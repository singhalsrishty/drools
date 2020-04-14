package com.drools.org.drools.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.drools.org.drools.service.KieService;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public KieService kieService() {
		return new KieService();
	}
	

}
