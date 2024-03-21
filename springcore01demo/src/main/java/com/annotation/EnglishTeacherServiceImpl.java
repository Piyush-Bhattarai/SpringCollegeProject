package com.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary  // by default this class will be called
public class EnglishTeacherServiceImpl implements TeacherService{

	@Override
	public void teach() {
		System.out.println("I'm a English Teacher");
		
	}

}
