package com.durga;

import java.util.List;

public class Subjects {
	
	private List<String> subject;

	public List<String> getSubject() {
		return subject;
	}

	public void setSubject(List<String> subject) {
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return subject.toString();
	}

}
