package com.test.spring;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.dao.StudentMapple;
import com.test.pojo.Student;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-dao.xml")
public class StudentSpring {
	
	@Autowired
	private  StudentMapple studentMapple;
	public StudentSpring(){
		
	}
	@Test
	public void test() throws IOException {
         Student student2 = studentMapple.select(1);
         System.out.println(student2);
         System.out.println(getClass());
         System.out.println();
         System.out.println(Integer.toHexString(11111));
         ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();  
         Resource[] resources = resourcePatternResolver.getResources("classpath*:com/test/**/*.class"); 
         for (Resource resource : resources) {
			System.out.println(resource.getFilename());
		}
	}
}
