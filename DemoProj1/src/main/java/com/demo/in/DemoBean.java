package com.demo.in;

public class DemoBean {
	
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	
	public void wish()
	{
		System.out.println("Welcome "+name);
	}

}
