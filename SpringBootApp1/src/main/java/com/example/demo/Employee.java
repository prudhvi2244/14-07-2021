package com.example.demo;

import org.springframework.beans.factory.annotation.Value;

public class Employee {

	@Value("${employee.eid}")
	private Integer eid;
	@Value("${employee.ename}")
	private String ename;
	@Value("${employee.ecity}")
	private String ecity;

	public Employee() {

	}
	
	public void displayEmployeeDetails()
	{
		System.out.println("Employee ID :"+eid);
		System.out.println("Employee Name :"+ename);
		System.out.println("Employee City :"+ecity);
	}

	public Employee(Integer eid, String ename, String ecity) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.ecity = ecity;
	}


	public void setEid(Integer eid) {
		this.eid = eid;
	}

	

	public void setEname(String ename) {
		this.ename = ename;
	}

	

	public void setEcity(String ecity) {
		this.ecity = ecity;
	}

}
