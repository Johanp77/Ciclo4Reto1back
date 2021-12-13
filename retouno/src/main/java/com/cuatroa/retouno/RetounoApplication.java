package com.cuatroa.retouno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class RetounoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetounoApplication.class, args);
	}

}
