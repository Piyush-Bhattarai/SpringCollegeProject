package com.annotation;

import org.springframework.stereotype.Component;

@Component
public final class MathTeacherServiceImpl implements TeacherService{

	@Override
	public void teach() {
		System.out.println("I'm a Math Teacher");
		
	}

}
