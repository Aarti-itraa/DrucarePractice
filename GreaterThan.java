package com.drucare.java8;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class GreaterThan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> c= (num) ->{ if(num>100)System.out.println(num+" Number is greater than 100");};
		c.accept(55);
		Consumer<Integer> c1= (num) ->{ if(num>100)System.out.println(num+" Number is greater than 100");};
		c1.accept(505);
	}

}
