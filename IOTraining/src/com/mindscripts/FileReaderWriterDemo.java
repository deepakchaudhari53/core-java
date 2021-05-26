package com.mindscripts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileReaderWriterDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("deleteFile.txt");
		System.out.println(file.getAbsolutePath());
		try {

			Writer fileWriter = new FileWriter(file);
			BufferedWriter writer = new BufferedWriter(fileWriter);
			writer.write("This is the first file I am writing to via a program in Java, getting a hang on of the APIs, too many clases provided!");
			writer.flush();
			writer.close();
			Reader fileReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(fileReader);
			String s;
			while ((s = reader.readLine()) != null) {
				System.out.println("Line:" + s);
			}
			fileReader.close();
			//file.delete();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
