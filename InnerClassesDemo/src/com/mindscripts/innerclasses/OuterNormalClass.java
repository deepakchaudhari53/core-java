package com.mindscripts.innerclasses;


public class OuterNormalClass {

	private int outerName;

	public int addTwoNumbers(int a, int y) {
		// print out values of even indices of the array
		InnerNormalClass innerNormalClass = new InnerNormalClass();
		innerNormalClass.innerClassMethod();
		System.out.println("added two numbers " + (a + y));
		return a + y;
	}

	public class InnerNormalClass {

		private String innerName= "inner class variable";

		public void innerClassMethod() {
			System.out.println("can access outer variable even if private: "
					+ outerName);
			System.out.println("inside inner class method " + innerName);
		}

	}

	public static void main(String[] args) {
		
		// instantiating a normal inner class
		OuterNormalClass outerObject = new OuterNormalClass();
		outerObject.addTwoNumbers(2, 3);

		//OR
		OuterNormalClass outerObject1 = new OuterNormalClass();
		OuterNormalClass.InnerNormalClass innerObject = outerObject1.new InnerNormalClass();
		innerObject.innerClassMethod();

	}

}
