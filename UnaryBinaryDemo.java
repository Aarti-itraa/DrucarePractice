package com.drucare.java8;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryDemo {

	static UnaryOperator<String> uo1 = name->name.toUpperCase();
	static UnaryOperator<Integer> uo2 = a->a+100;
	static Comparator<Integer> c1 =(a,b)->a.compareTo(b);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Unary Operator String: " +uo1.apply("Hello Team"));
		System.out.println("\nUnary Operator Integer: "+uo2.apply(50));
		
		
		BinaryOperator<Integer> bo1 =BinaryOperator.maxBy((a,b)->(a>b)?1:(a==b)?0:-1);
		System.out.println("\nBinary Operator Max by: "+bo1.apply(5555, 5555));
		
		BinaryOperator<Integer> bo2 =BinaryOperator.maxBy(c1);
		System.out.println("\nBinary Operator Max by using comparator: "+bo2.apply(22,77733));
		
		BinaryOperator<Integer> bo3 =BinaryOperator.minBy(c1);
		System.out.println("\nBinary Operator Min by using comparator: "+bo3.apply(88888, 000101));
		
	}

}
