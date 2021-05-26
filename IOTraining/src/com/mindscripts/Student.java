package com.mindscripts;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int height = 6;
	public int weight = 60;
	transient public String name = "XXX";
	private Address address = new Address();
	

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	private void readObject(ObjectInputStream os) {
		try {
			os.defaultReadObject();
			int flag = os.readInt();
			System.out.println("extra int written: : " + flag);
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void writeObject(ObjectOutputStream os) {
		try {
			System.out.println("in private write method of class");
			os.defaultWriteObject();
			os.writeInt(10);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
