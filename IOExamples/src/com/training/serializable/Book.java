package com.training.serializable;

import java.io.Serializable;

public class Book implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int bookNumber;
	private String bookName;
	private String author;
	private transient double price;
	
	public Book() {
		super();
		System.out.println("Book Initialized with default constructor");
	}

	public Book(int bookNumber, String bookName, String author, double price) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		System.out.println("Book Initialized with parameterized constructor");
	}

		public int getBookNumber() {
			return bookNumber;
		}

		
		public void setBookNumber(int bookNumber) {
			this.bookNumber = bookNumber;
		}

		public String getBookName() {
			return bookName;
		}

		public void setBookName(String bookName) {
			this.bookName = bookName;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Book Number: " + bookNumber + "\nBook Name: " + bookName + "\nAuthor: " + author + "\nPrice: " + price;
		}
}
