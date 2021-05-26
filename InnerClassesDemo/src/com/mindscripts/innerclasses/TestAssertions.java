package com.mindscripts.innerclasses;



public class TestAssertions {
	
	public static void main(String[] args) {
		TestAssertions ta = new TestAssertions();
		ta.setWeight(85.4f);
		ta.setWeight(65.4f);
		ta.setWeight(45.4f);
		ta.setWeight(35.4f);
		ta.setWeight(-65.4f);
	}
	
	public void setWeight(float weight){
		
		assert(weight > 0):"Weight cannot be -ve";
		
		if(weight > 80){
			System.out.println("Overweight");
		}
		else if(80 > weight && weight > 50){
			System.out.println("Fit");
		}
		else if(50 > weight && weight > 40){
			System.out.println("Underweight");
		}else{
			System.out.println("Eat something");
		}
		
	}

}
