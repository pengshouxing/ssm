package com.test.dao;

import com.test.pojo.Student;

public interface StudentMapple {
	public void insert(Student student);

	public Student select(Integer id);
}
