package com.drools.org.drools.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.drools.org.drools.service.CacheService;
import com.drools.org.drools.service.DroolsService;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public DroolsService kieService() {
		return new DroolsService();
	}
	
	@Bean
	public CacheService cacheService() {
		return new CacheService();
	}
	
	/** If no other cache mechanism used, then spring will use in-build
	 * ConcurrentMapCacheManager, so no need to declare it explicitly here
	 */
	
	/*
	 * @Bean public CacheManager cacheManager() { return new
	 * ConcurrentMapCacheManager("rates"); }
	 */

}
