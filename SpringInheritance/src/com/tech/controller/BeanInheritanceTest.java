package com.tech.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInheritanceTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

		Customer cus1 = (Customer) applicationContext.getBean("baseCustomer");
		System.out.println("cus1="+cus1.toString());
		
		Customer cus2 = (Customer)applicationContext.getBean("customer");
		System.out.println("cus2="+cus2.toString());
	}
}
