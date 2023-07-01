package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		var cl = SpringApplication.run(DemoApplication.class, args);
		Course c = cl.getBean(Course.class);
		System.out.println(c.toString());

	}

}
