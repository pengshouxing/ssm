package com.test.test;

import org.springframework.util.ClassUtils;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
			Class<?> clazz = ClassUtils.forName("com.test.test.Test", Test.class.getClassLoader());
			System.out.println(clazz);
		} catch (ClassNotFoundException | LinkageError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
