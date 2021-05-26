package com.mindscripts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestStreams {

	public void readFromStream() throws IOException {
		FileInputStream fis = new FileInputStream("testfile.txt");
		Integer i, counter = 0;
		Integer[] out = new Integer[fis.available()];
		while ((i = fis.read()) != -1) {
			System.out.println("read from stream: " + i);
			out[counter++] = i;
		}
		fis.close();
		// System.out.println("Writing this to a new file");
		writeToStream(out);
	}

	public void readTextFromStream() throws IOException {
		FileReader fis = new FileReader("testfile.txt");

		Integer i = 0;
		String s = null;
		while ((i = fis.read()) != -1) {
			System.out.println("read textfrom stream: " + i);
		}
		fis = new FileReader("testfile.txt");
		BufferedReader reader = new BufferedReader(fis);
		FileWriter fos = new FileWriter("WriteFile.txt");
		BufferedWriter writer = new BufferedWriter(fos);

		while ((s = reader.readLine()) != null) {
			System.out.println("read line:: "+s);
			writer.write(s + "\n");
		}

		fis.close();
		writer.flush();
		writer.close();

	}

	public void writeToStream(Integer[] bytes) throws IOException {
		FileOutputStream fos = new FileOutputStream("newOutFile.txt");
		for (int i : bytes) {
			fos.write(i);
		}
		fos.close();
	}

	public static void main(String[] args) throws IOException {
		System.out.println("Testing Streams");
		TestStreams stream = new TestStreams();
		 stream.readFromStream();

		//stream.readTextFromStream();

		//writeStringArrayToFile();
	}

	private static void writeStringArrayToFile() throws IOException {
		String[] a = { "Test", "Testing", "Testing123" };
		FileWriter fos = new FileWriter("WriteStringArray.txt");
		BufferedWriter writer = new BufferedWriter(fos);
		for (String s : a) {
			writer.write(s + "\n");
		}
		writer.flush();
		writer.close();

	}

}
