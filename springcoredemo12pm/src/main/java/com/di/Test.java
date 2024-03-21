package com.di;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Product p = (Product) context.getBean("prod");
		
		Employee em1 = context.getBean("emp", Employee.class);
		
		System.out.println(em1);
		
		
		System.out.println(p);
		
		
	}

}
