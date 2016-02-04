package com.training.serializable;

public class Application {

	public static void main(String[] args) {

		BookSerializer obj = new BookSerializer();
		Book book = new Book (101, "Argumentative Indian", "Amartya Sen", 500.00);
		String message = obj.serialize(book);
		if (message != null)
		{
			System.out.println(message);
		}
		else
		{
			System.out.println("Error - Check the code");
		}
		
		Book bk = (Book)obj.deSerialize();
		System.out.println(bk);
		
	}

}
