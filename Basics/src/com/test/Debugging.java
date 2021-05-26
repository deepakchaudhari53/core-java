package com.test;

public class Debugging {
	static int[] ints = { -12, 50, 5, 8, 120 };
	static int min;

	public static void main(String[] args) {
		for (int i : ints) {
			if (i < min) {
				min = i;
			}
		}
		System.out.println("Min value is = " + min);
	}
}