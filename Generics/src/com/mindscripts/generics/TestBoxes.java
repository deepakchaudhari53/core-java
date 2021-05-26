package com.mindscripts.generics;



public class TestBoxes {

	public static void main(String[] args) {
		Box b = new Box();
		b.setItem(Double.valueOf(12.12));
		b.getItem();//no idea what item this is!
		Double d = (Double)b.getItem();
		
		GenericBox<Double> doubleBox = new GenericBox<Double>();
		doubleBox.setItem(Double.valueOf(15.5));
		
		//now we know exactly what is 
		//so no casting
		d = doubleBox.getItem();
		
		//what if I want a box of Strings?
		GenericBox<String> boxOfStrings = new GenericBox<String>();
		boxOfStrings.setItem("Adding a string here");
		
		//Make generics bounded
		RestrictedGenericBox<Integer> integerBox = new RestrictedGenericBox<Integer>();
		integerBox.setNumber(12);
		//RestrictedGenericBox<String> stringBox = new RestrictedGenericBox<String>();	//won't work, because String doesn't extend or implement Number.

	}
}
