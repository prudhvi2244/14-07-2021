package com.demo.in;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Address {

	
	public Address(String street, String city, String state) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
	}

	private String street;
	private String city;
	private String state;
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public void displayAddress()
	{
		System.out.println("Street :"+street);
		System.out.println("City :"+city);
		System.out.println("State :"+state);
		
	}
	
	public Address() {
	
	}
	
}
