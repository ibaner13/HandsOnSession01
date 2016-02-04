package com.training.serializable;

import java.io.*;

public class BookManagerApplication {

	public static void main(String[] args) {

		BookManager bks = new BookManager();
		
		Book bk1 =  new Book(101, "Java", "Schmidt", 500);
		Book bk2 =  new Book(102, "C++", "Mark", 250);
		Book bk3 =  new Book(103, "Python", "Abc", 700);
		
		Book[] bk = {bk1, bk2, bk3};
		System.out.println(bks.addBooks(bk));
		
		File databaseFile = new File("Books.txt");
		bks.printBooks(databaseFile);
	
	}
}
