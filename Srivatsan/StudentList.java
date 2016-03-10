package com.training.samples;

import java.util.*;

public class StudentList {

	
	private Set<String> names;
	private Set<Student> nameList;
	
	public StudentList(){
	
		names =new HashSet<String>();
		
		names.add("Ramesh");
		names.add("Suresh");
		names.add("Ramesh");
		
	}
	
	public Set<String> getNames(){
		
		return names;
	}
	
	public Set<Student> getStudentList(){
		
		return nameList;
	}

	public Set<Student> getNameList() {
		return nameList;
	}

	public void setNameList(Set<Student> nameList) {
		this.nameList = nameList;
	}
	
	
}
