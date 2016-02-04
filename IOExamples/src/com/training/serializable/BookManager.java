package com.training.serializable;

import java.io.*;

public class BookManager {


	public BookManager() {
		super();
	}

	@SuppressWarnings({ "finally" })
	public String addBooks(Book[] bks)
	{
		PrintWriter out = null;
		
		try {
			 out = new PrintWriter(new FileWriter ("Books.txt"));
			for(Book bookArrayElement : bks )
			{
				out.print(bookArrayElement.getBookName()+" , ");
				out.print(bookArrayElement.getAuthor()+" , ");
				out.print(bookArrayElement.getBookNumber()+" , ");
				out.println(bookArrayElement.getPrice());
				System.out.println("1 book content added");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			out.close();
			return "Exiting addBooks";
		}
	}
	
	public void printBooks(File fileName)
	{
		BufferedReader br = null;
		try {
			br = new BufferedReader (new FileReader (fileName));
			try {
//				String s = br.readLine();
//				while (s!=null)
//					System.out.println(s);    //it will keep on printing the same string forever
				String line;
				while((line = br.readLine()) !=null) 
				{ 
				
					System.out.println(line); 
				} 
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
