package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Student;

@Configuration
public class AppConfig implements CommandLineRunner{

	@Autowired
	private Student student;
	
	@Override
	public void run(String... args) throws Exception {
		
		student.displayStudentDetails();
	}
	
}
