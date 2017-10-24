package com.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentSpring {
	public static void main(String[] args) {
		ApplicationContext ac = (ApplicationContext) new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
		StudentSpring studentSpring = ac.getBean(StudentSpring.class);
		System.out.println(studentSpring);
	}
}
