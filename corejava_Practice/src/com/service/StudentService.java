package com.service;

import java.util.List;

import com.model.Student;

public interface StudentService {

	void addStudent(Student s);
	
	void deleteStudent(int id);
	
	List<Student> getAllStudent();
	
}
