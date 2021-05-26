package com.mindscripts.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {

	public static void main(String[] args) {
		GenericBox<String> stringBox = new GenericBox<String>();
		stringBox.setItem("String1");
		printT(stringBox);

		// adding bounds to method - this will take only a box of String
		printBox(stringBox);

		// taking it one level forward - printing a generic list which contains
		// generic objects.
		List<String> stringsGenericList = new ArrayList<String>();
		stringsGenericList.add("Hello");
		stringsGenericList.add("World");
		printGenericCollections(stringsGenericList);

	}

	private static <T> void printT(T t) {
		if (t instanceof GenericBox) {
			System.out.println(((GenericBox) t).getItem());
		}
	}

	private static void printBox(GenericBox<? extends String> t) {
		System.out.println(t.getItem());
	}

	// This can print any collection of any object
	public static <E, T extends Iterable<E>> void printGenericCollections(T t) {
		for (E e : t) {
			System.out.println(e);
		}
	}

}
