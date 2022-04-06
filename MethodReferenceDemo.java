package com.drucare.java8;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names=new ArrayList<String>();
		
		names.add("Raj");
		names.add("Simran");
		names.add("Rahul");
		names.add("Anjali");
		names.add("Priya");
		names.add("Naina");
		System.out.println("Double colon operator or Method reference\n");
		names.forEach(System.out::println);
		
	//OR	
		/*for (String name : names) {
			System.out.println(name);
		}*/
		
		
		
	}

}
