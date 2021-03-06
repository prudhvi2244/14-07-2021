package com.demo.in;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeClient1 {
	
	/* emp1 : 1,Rajeev,rajeev@gmail.com - MG Road Mysore Karnataka
	 * 
	 * emp1==emp2
	 * emp1,emp2 referring to Employee Object
	 * 
	 * Scopes : singleton,prototype,request,session
	 */

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext("com.demo.in");
		Employee emp1=context.getBean("emp",Employee.class);
		Address address1=new Address("MG ROAD","Mysore","Karnataka");
		emp1.setEid(1);
		emp1.setEname("Rajeev");
		emp1.setEmail("rajeev@gmail.com");
		emp1.setAddress(address1);
		emp1.displayEmployeeDetails();
		
		System.out.println("********************************************");
		
		Employee emp2=context.getBean("emp",Employee.class);
		emp2.setEid(2);
		emp2.setEname("Praveen");
		emp2.setEmail("Praveen@gmail.com");
		
		Address address2=new Address("MG ROAD","Bangalore","Karnataka");
		emp2.setAddress(address2);
		emp2.displayEmployeeDetails();
		
		Employee emp3=context.getBean("emp",Employee.class);
		emp3.setEid(3);
		emp3.setEname("Raju");
		emp3.setEmail("raju@gmail.com");
		Address address3=new Address("MG ROAD","Vijayawada","Andhra Pradesh");
		emp3.setAddress(address3);
		emp3.displayEmployeeDetails();
		
		Employee emp4=context.getBean("emp",Employee.class);
		emp4.setEid(4);
		emp4.setEname("Saran");
		emp4.setEmail("saran@gmail.com");
		Address address4=new Address("MG ROAD","Chennai","Tamil Nadu");
		emp4.setAddress(address4);
		emp4.displayEmployeeDetails();
		
		System.out.println(emp1==emp2);
		System.out.println(emp1==emp3);
		System.out.println(emp1==emp4);
		System.out.println(emp2==emp4);
		System.out.println(emp2==emp3);
		System.out.println(emp3==emp4);
		

	}

}
