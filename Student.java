package com.durga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	private String name;
	private int rollno;
	
	@Autowired
	@Qualifier("CreateAddId2")
	private Address address;
	
	@Autowired
	private Subjects subject;
	public Subjects getSubject() {
		return subject;
	}
	public void setSubject(Subjects subject) {
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	
	
	public void show() {
		
		System.out.println("Name : " + name);
		System.out.println("Rollno. : " + rollno);
		System.out.println("Address :" + address);
		System.out.println("Subjects : " + subject);
	}

}
