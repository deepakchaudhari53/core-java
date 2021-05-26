package com.test;

enum Animals{
	DOG("woof"), CAT("meow");
	String sound;
	private Animals(String s){
		sound = s;
	}
}
public class TestEnums {
	public static void main(String[] args) {
		System.out.println(Animals.CAT.sound + " " + Animals.DOG.sound);
	}
}
/*
 * predict the output: Consider access modifiers.
 * meow woof?
 * Multiple compilation errors?
 * Compilation error at line 4? 6? 12?
 */
