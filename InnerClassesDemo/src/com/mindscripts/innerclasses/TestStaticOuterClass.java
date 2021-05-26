package com.mindscripts.innerclasses;

public class TestStaticOuterClass {
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public void testStaticInner() {
		StaticInnerClass ic = new StaticInnerClass();
		ic.method1();
	}

	public static class StaticInnerClass {
		public StaticInnerClass() {

		}

		public void method1() {
			System.out.println("Hello");
		}
	}

	public static void main(String[] args) {
		// out class instance is not required in case of static inner classes
		TestStaticOuterClass.StaticInnerClass sc = new StaticInnerClass();
		sc.method1();
		// OR
		TestStaticOuterClass testStaticOuterClass = new TestStaticOuterClass();
		testStaticOuterClass.testStaticInner();
	}
}
