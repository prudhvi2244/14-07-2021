package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	public Student() {

	}

	@Value("${student.sid}")
	private Integer sid;
	@Value("${student.sname}")
	private String sname;
	@Value("${student.marks}")
	private Double smarks;
	@Autowired
	private Address address; // HAS-A Relationship

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setSmarks(Double smarks) {
		this.smarks = smarks;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void displayStudentDetails()
	{
		System.out.println("Student ID :"+sid);
		System.out.println("Student Name :"+sname);
		System.out.println("Student Marks :"+smarks);
		address.displayAddress();
		System.out.println("*************************************");
	}
	
}
