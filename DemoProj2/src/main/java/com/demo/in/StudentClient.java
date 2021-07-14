package com.demo.in;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentClient {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("studentcfg.xml");
		
		Student student=(Student)context.getBean("s1");
		student.displayStudentDetails();

	}

}
