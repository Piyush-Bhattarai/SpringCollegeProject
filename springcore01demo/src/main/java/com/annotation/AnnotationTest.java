package com.annotation;

import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationTest {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		College cl = context.getBean("college", College.class);
		
		cl.printCollege();
		
//		Student std = context.getBean("student",Student.class);
//		std.printStudent();
		
		
	}

}
