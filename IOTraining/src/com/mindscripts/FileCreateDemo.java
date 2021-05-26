package com.mindscripts;

import java.io.File;
import java.io.IOException;

public class FileCreateDemo {

	public static void main(String[] args) {
		// creates only a File object, does not create a text file
		File file = new File("firstFile.txt");
		System.out.println("is a directory?:: "+file.isDirectory());
		System.out.println("is a file?:: "+file.isFile());
		
		try {
			boolean newFileCreated = file.createNewFile();
			System.out.println(newFileCreated);
			System.out.println("directory now: "+file.isDirectory());
			System.out.println("file now:: "+file.isFile());
			System.out.println(file.renameTo(new File("new.txt")));

			System.out.println(file.delete());
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
