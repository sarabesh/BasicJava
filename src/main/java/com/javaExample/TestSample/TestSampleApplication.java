package com.javaExample.TestSample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSampleApplication {

	public static void main(String[] args) {
		System.out.println("testing changes");
		SpringApplication.run(TestSampleApplication.class, args);
	}

}
