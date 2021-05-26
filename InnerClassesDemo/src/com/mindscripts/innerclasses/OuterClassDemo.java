package com.mindscripts.innerclasses;

public class OuterClassDemo {

	private static String outerClassName = "outerClassName";

	public static void testLocalClasses(final int x, final int y) {
		class LocalClass extends Thread {
			public LocalClass() {

				System.out.println("in add numbers of local class");
				System.out.println("access to outer class instance variable:: "
						+ outerClassName);
				System.out.println("access to method params::  " + x + " and "
						+ y);
			}

			public void m1(){
				System.out.println("inside m1 method of method local inner class"+ x + y);
			}
		}
		LocalClass localClass = new LocalClass();
		localClass.m1();

	}

	public static void main(String[] args) {
		testLocalClasses(2, 3);
		
	}

}
