package com.demo.in;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "emp")
@Scope("prototype")
public class Employee {
	
	
	public Employee() {
	}
	
	//@Value("1")
	private Integer eid;
	//@Value("Prudhvi")
	private String ename;
	//@Value("raj@gmail.com")
	private String email;
	
	//@Autowired // Field Injection
	private Address address; //HAS-A Relationship
	
	//@Autowired // Setter Injection
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
	public void displayEmployeeDetails()
	{
		System.out.println("Employee ID :"+eid);
		System.out.println("Employee Name :"+ename);
		System.out.println("Employee Mail:"+email);
		System.out.println("............Employee Address...........");
		address.displayAddress();
	}
}
