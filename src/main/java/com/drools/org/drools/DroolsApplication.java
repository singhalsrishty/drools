package com.drools.org.drools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.drools.org.drools.config.ApplicationConfig;

@SpringBootApplication
@Import({ApplicationConfig.class})
public class DroolsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DroolsApplication.class, args);
	}

}
