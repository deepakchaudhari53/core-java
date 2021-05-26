package com.mindscripts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestInput {

	public void fromConsole() throws IOException {
		System.out.println("Start reading from console");
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String s;
		while (!(s = br.readLine()).equals("finish")) {
			System.out.println(s);
		}
	}

	public void fromFile() throws IOException {
		System.out.println("Starting reading from File");
		File file = new File("G:/testFile.txt");
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader reader = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(reader);
		String s;
		while ((s = br.readLine()) != null) {
			System.out.println("Line:" + s);
		}
	}

	public static void main(String[] args) throws IOException {
		System.out.println("Let's start main!");
		TestInput ti = new TestInput();
		 ti.fromConsole();
		//ti.fromFile();
	}

}
