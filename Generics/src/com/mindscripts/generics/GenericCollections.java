package com.mindscripts.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericCollections {
	public static void main(String[] args) {
		String[] strings = {"Hello", "World"};
		for(String s : strings){
			System.out.println(s);
		}
		
		// try the same using lists
		List stringsList = new ArrayList();
		stringsList.add("Hello");
		stringsList.add("World");
//		stringsList.add(Integer.valueOf(12));
		for(Object o : stringsList){
			String s = (String)o;
			System.out.println(s);
		}
		
		//That's why you need a string typecasting of collections.
		List<String> stringsGenericList = new ArrayList<String>();
		stringsGenericList.add("Hello");
		stringsGenericList.add("World");
//		stringsGenericList.add(Integer.valueOf(12));
		for(String s : stringsGenericList){
			System.out.println(s);
		}
		
	}
}
