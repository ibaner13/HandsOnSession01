package com.training.tests;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.training.samples.Student;
import com.training.samples.StudentList;

public class StudentListTest {

	StudentList list =null;
	@Before
	public void setUp() throws Exception {
		 list =new StudentList();
	}

	@Test
	public void test() {
		StudentList list =new StudentList();
		
		 int actual = list.getNames().size();
		 
		 assertEquals(3, actual);
		 
		 
	}

	@Test
	public void testStudentNotNull(){
		
	
		
		   Object obj =list.getStudentList();
		   
		   assertNotNull(obj);
	}
	
	@Test
	public void testSetAcceptDuplicate(){
		
		Student s1=new Student(101,"Ramesh");
		Student s2=new Student(101,"Ramesh");
		
		HashSet<Student> stud =new HashSet<Student>();
		
		stud.add(s1);
		stud.add(s2);
		
	    list.setNameList(stud);
	    
	    int actual = list.getNameList().size();
	    
	    assertEquals(1, actual);
		
		
	} 
}
