package com.mindscripts;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class DirectoryAndFileWithPrintWriterDemo {
	
	public static void main(String[] args) {
		File myDir = new File("newDir");
		myDir.mkdir();
		System.out.println(myDir.isDirectory());
		System.out.println(myDir.isFile());
		File file = new File(myDir, "file1.txt");
	
		try {
			file.createNewFile();
			System.out.println(file.isDirectory());
			System.out.println(file.isFile());
			
			PrintWriter printWriter = new PrintWriter(file);
			printWriter.write("new content stuffed in the new file");			
			printWriter.flush();
			printWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
