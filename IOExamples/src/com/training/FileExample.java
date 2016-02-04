package com.training;

import java.io.*;

public class FileExample {

	public static void main(String[] args) {

		File f = new File("Sample.txt");
		try{
			f.createNewFile();	
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
				
		PrintWriter writer;
		try
		{
			writer = new PrintWriter(f);
			writer.println("Hello");
			writer.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println(f.exists());
	}
}
