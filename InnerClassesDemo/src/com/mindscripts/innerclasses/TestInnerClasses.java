package com.mindscripts.innerclasses;



public class TestInnerClasses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// instantiating a static nested class
		// TestStaticOuterClass.StaticInnerClass sc = new StaticInnerClass();
		// sc.method1();

		// instantiating a normal inner class
		OuterNormalClass outerObject = new OuterNormalClass();
		OuterNormalClass.InnerNormalClass innerObject = outerObject.new InnerNormalClass();
		// calling inner class method via inner class reference itself
		innerObject.innerClassMethod();

		// calling inner class method via outer class reference; because the
		// outer class scope instantiates the inner class
		outerObject.addTwoNumbers(2, 3);
		
	}

}
