package com.demo.in;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class Client {

	public static void main(String[] args) {
		
		ClassPathResource resource=new ClassPathResource("/employeecfg.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Employee employee1=(Employee)factory.getBean("e1");
		Employee employee2=(Employee)factory.getBean("e2");
		
		System.out.println("Employee Name:"+employee1.ename);
		System.out.println("Employee Name:"+employee2.ename);
		

	}

}
