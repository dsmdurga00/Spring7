package com.durga.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.durga.Address;
import com.durga.Student;
import com.durga.Subjects;

@Component
public class ConfigFile {
	
	@Bean
	public Student CreateStdId() {
		
		Student s = new Student();
		
		s.setName("Shankar");
		s.setRollno(101);
		
		return s;
	}
	
	@Bean
	public Address CreateAddId1() {
		
		Address a = new Address();
		
		a.setHousename("The Bhawani House");
		a.setCity("Dipka");
		a.setPincode(495452);
		return a;
	}
	
     @Bean	
     public Address CreateAddId2() {
		
		Address a = new Address();
		
		a.setHousename("The Bhawani House");
		a.setCity("Korba");
		a.setPincode(495452);
		return a;
	}
     
     @Bean
      public Subjects CreateSubId() {
    	 
    	 Subjects sub = new Subjects();
    	 
    	 List<String> subject_list = new ArrayList<String>();
    	 
    	 subject_list.add("Java");
    	 subject_list.add("Maths");
    	 subject_list.add("C++");
    	 subject_list.add("Spring");
    	 
    	 sub.setSubject(subject_list);
    	 
    	 return sub;
     }

}
