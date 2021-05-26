package com.mindscripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSer {
	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		TestSer ts = new TestSer();
		Student s = new Student();
		ts.writeToFile(s);
		Student s1 = ts.readFromFile();
		System.out.println(s1.weight + " " + s1.getAddress().getCity()+" "+s1.name+" "+s1.getAddress().getCountry());
		
	}

	private void writeToFile(Student s) throws IOException {
		FileOutputStream fos = new FileOutputStream("G:/student.ser");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(s);
	}

	private Student readFromFile() throws IOException, ClassNotFoundException {
		FileInputStream fos = new FileInputStream("G:/student.ser");
		ObjectInputStream os = new ObjectInputStream(fos);
		Student a=null;
		Object object = os.readObject();
		if(object instanceof Student){
			a = (Student)object;
		}
		return a;
	}

}