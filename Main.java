package com.durga.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.durga.Student;
import com.durga.resource.ConfigFile;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Example of AutoWiring........................");

		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);
		
		Student std = (Student) context.getBean(Student.class);
		
		std.show();
	}

}
