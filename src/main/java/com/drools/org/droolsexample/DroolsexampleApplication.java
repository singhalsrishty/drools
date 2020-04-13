package com.drools.org.droolsexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.drools.org.droolsexample.config.ApplicationConfig;

@SpringBootApplication
@Import({ApplicationConfig.class})
public class DroolsexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DroolsexampleApplication.class, args);
	}

}
