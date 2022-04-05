package com.drucare.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddWithStream {

	public static void main(String[] args) {
		// TODO, Auto-generated method stub

		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,22,55,88,66,43,51,85);
		
		//Prining all the even numbersfrom the list
		
		List<Integer> evenNumbers=list.stream().filter(n->(n%2==0)).collect(Collectors.toList());
		System.out.println("Even Numbers in the List are: "+evenNumbers);
		
	}

}
