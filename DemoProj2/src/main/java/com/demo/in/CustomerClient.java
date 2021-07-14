package com.demo.in;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CustomerClient {

	public static void main(String[] args) {
		
		ClassPathResource resource=new ClassPathResource("customercfg.xml");
		XmlBeanFactory factory=new XmlBeanFactory(resource);
		
		Customer c1=(Customer)factory.getBean("c1");
		Customer c2=(Customer)factory.getBean("c2");
		c1.displayCustomerDetails();
		c2.displayCustomerDetails();

	}

}
