package com.demo.in;

public class Customer {

	private Integer cid;
	private String cname;
	private String city;
	
	public Customer() {
		
	}

	public Customer(Integer cid, String cname, String city) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.city = city;
	}
	
	
	public void displayCustomerDetails()
	{
		System.out.println("Customer Id :"+cid);
		System.out.println("Customer Name :"+cname);
		System.out.println("Customer City :"+city);
	}
	
	
}
