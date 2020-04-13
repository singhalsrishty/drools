package com.drools.org.droolsexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.drools.org.droolsexample.service.KieService;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public KieService kieService() {
		return new KieService();
	}
	

}
