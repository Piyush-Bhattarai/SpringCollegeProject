package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Student;

public class StudentServiceImpl implements StudentService{

    static List<Student> slist = new ArrayList<>();
	
	@Override
	public void addStudent(Student s) {
		
		slist.add(s);
		System.out.println("Student Added Successfully! " +slist.size());
		
	}

	@Override
	public void deleteStudent(int id) {
		
		slist.remove(id);
		System.out.println("Student deleted Successfully!" + slist.size());
		
		
		
	}

	@Override
	public List<Student> getAllStudent() {
		
		
		return slist;
	}

}
