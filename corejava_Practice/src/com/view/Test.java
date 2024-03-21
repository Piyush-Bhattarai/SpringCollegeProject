package com.view;

import java.util.List;

import com.model.Student;
import com.service.StudentService;
import com.service.StudentServiceImpl;

public class Test {
	
	public static void main(String[] args) {
		
		
		add();
		getAll();
		delete();
		
		
		
		
	}
	
	static void add() {
		
		StudentService service = new StudentServiceImpl();
		
		Student s = new Student();
		
		s.setId(1);
		s.setName("Piyush");
		s.setGrade("60");
		s.setRollno(21);
		
		service.addStudent(s);
		
		//System.out.println(s);
		
	}
	
	static void delete() {
		
		StudentService service = new StudentServiceImpl(); 
			
			service.deleteStudent(0);
			
	}
	
	static void getAll() {
		
		
		StudentService service = new StudentServiceImpl();
		
		List<Student> slist =  service.getAllStudent();
		
		System.out.println(slist);
		
	}

}
