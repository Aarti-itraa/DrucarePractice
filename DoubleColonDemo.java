package com.drucare.java8;

import java.util.Arrays;
import java.util.List;

public class DoubleColonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> countryList = Arrays.asList("India","", "China", "USA", "","Japan", "UK", "Russia", "Canada", "Iran",
				"Iraq");
		countryList.stream().filter(n->n.startsWith("I")).forEach(System.out::print);

	}

}
