package com.demo.in;

import org.springframework.util.FileSystemUtils;

public class Student {

	public Student() {
		
	}
	
	
	private Integer sid;
	private String sname;
	private String scity;

	

	public void setSid(Integer sid) {
		this.sid = sid;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}

	
	public void setScity(String scity) {
		this.scity = scity;
	}
	
	public void displayStudentDetails()
	{
		System.out.println("Student ID :"+sid);
		System.out.println("Student Name :"+sname);
		System.out.println("Student City :"+scity);
	}

	
}
