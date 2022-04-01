package com.drucare.java8;

import java.util.function.Consumer;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Consumer<Integer> c1= (num) ->{ if(num%2==0)System.out.println(num+" is Even Number");};
		c1.accept(20); 		//accept - abstract method
		 
		Consumer<Integer> c2= (num) ->{ if(num%2!=0)System.out.println(num+" is Odd Number");};
		c2.accept(55); 	
			
	}
}
