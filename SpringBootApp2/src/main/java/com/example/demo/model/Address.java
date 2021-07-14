package com.example.demo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	public Address() {
	
	}

	@Value("${student.address.city}")
	private String city;
	@Value("${student.address.state}")
	private String state;
	
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public void displayAddress()
	{
		System.out.println("City :"+city);
		System.out.println("State :"+state);
	}
}
