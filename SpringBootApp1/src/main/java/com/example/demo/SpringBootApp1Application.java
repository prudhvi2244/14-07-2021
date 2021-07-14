package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp1Application implements CommandLineRunner {
	
	@Autowired
	private Employee employee;
	
	@Override
	public void run(String... args) throws Exception {
		
		employee.displayEmployeeDetails();
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApp1Application.class, args);
		System.out.println("Welcome To Spring Boot App");
	}

}
