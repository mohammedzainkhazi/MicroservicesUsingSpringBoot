package com.example.mslabspringboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MslabSpringbootTestApplication {

	public static void main(String[] args) {
		// SpringApplication.run(MslabSpringbootTestApplication.class, args);
		System.out.println('Hello Zain!');
		System.out.println('Hello Hustlers!');
	}

}
