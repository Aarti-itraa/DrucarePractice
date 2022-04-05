package com.drucare.java8;

import java.time.LocalDateTime;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface Interf{
	public void m();
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TO-DO Auto-generated method stub
		
		Interf i = () -> System.out.println("hello");
		i.m();
		///Pillars of Functional Interface
		
		//1. Consumer -> single i/p, no return type
		System.out.println("---------------- Consumer Output-------------");
		Consumer<String> c1= (s) -> System.out.println(s.toUpperCase());
		c1.accept("hello"); 		//accept - abstract method
		 
		Consumer<String> c2= (s) -> System.out.println(s.toLowerCase());
		c2.accept("hiiiii");
		
		c2.andThen(c1).accept("Hello HIII");
		
			//BiConsumer -> two i/p, no return type
		
			System.out.println("---------------- BiConsumer Output-------------");
			BiConsumer<Integer, Integer> bc1= (a,b) -> System.out.println("Sum of "+a+ " and "+b+ " = "+(a+b));
			bc1.accept(100,200); 		//accept - abstract method
		
			BiConsumer<Integer, Integer> bc2= (a,b) -> System.out.println("Product of "+a+ " and "+b+ " = "+(a*b));
			bc2.accept(100,200); 		
			
			BiConsumer<Integer, Integer> bc3= (a,b) -> System.out.println("Difference of "+a+ " and "+b+ " = "+(a-b));
			bc3.accept(100,200); 		
		
			BiConsumer<Integer, Integer> bc4= (a,b) -> System.out.println("Division of "+a+ " and "+b+ " = "+(a/b));
			bc4.accept(100,200); 
		
		//2.Predicate ->single i/p, boolean return type
		System.out.println("---------------- Predicate Output-------------");
		
		Predicate<Integer> p1= (a)->a>100;
		System.out.println(p1.test(10));		//test - abstract method
		Predicate<Integer> p2= (a)->a<100;
		System.out.println(p2.test(100));
		Predicate<Integer> p3= (a)->a==100;
		System.out.println(p3.test(100));
		Predicate<Integer> p4= (a)->a!=100;
		System.out.println(p4.test(100));
		
		System.out.println("AND "+p2.and(p3).test(10));

		System.out.println("AND "+p1.or(p2).test(10));

		System.out.println("AND "+p1.and(p2).test(10));
		
		
		//2.BiPredicate ->two i/p, boolean return type
				System.out.println("---------------- BiPredicate Output-------------");
				
				BiPredicate<Integer,Integer> p5= (a,b)->a>b;
				System.out.println("num1 > num2: "+p5.test(10,20));		//test - abstract method
				BiPredicate<Integer,Integer> p6= (a,b)->a<b;
				System.out.println("num1 < num2: "+p6.test(10,20));
				BiPredicate<Integer,Integer> p7=(a,b)->a==b;
				System.out.println("num1 == num2: "+p7.test(10, 20));
				BiPredicate<Integer,Integer> p8=(a,b)->a!=b;
				System.out.println("num1 != num2: "+p8.test(10, 20));
		
		
		
		//3.Suppiler ->no i/p, bulk of return data
		System.out.println("---------------- Suppiler Output-------------");

		Supplier s1 =()-> LocalDateTime.now();
		System.out.println(s1.get());		//get - abstract method
		
		//4.Function ->.single i/p, another as o/p 
		
		System.out.println("\n---------------- Function Output-------------\n");

		Function<String, String> f1 = name ->name.toLowerCase();
		Function<String, String> f2 = name ->name.toUpperCase();

		System.out.println("Function in Lowercase"+f1.apply("HELLO"));	//apply -abstract()
		System.out.println("Function in Uppercase"+f2.apply("hiii"));
		
		System.out.println("And Than "+f1.andThen(f2).apply("Java 8 FI"));
		System.out.println("Compose "+f1.compose(f2).apply("JAVA 8 FI"));
		
		
		//4.BiFunction ->two i/p, another as o/p
		System.out.println("--------BIFunction Example-------");
		BiFunction<String, String, String> bif =( a,b)->(a+" "+b).toUpperCase();
		
		BiFunction<Integer, Integer, Integer> bif1 =( a,b)->(a+b);

		//BiFunction<String, String, String> bif2 =( a,b)->(a+" "+b);
		System.out.println("BiFunction "+bif.apply("Hello", "Java"));
		System.out.println("BiFunction Integer "+ bif1.apply(10, 20)) 
		
	}

}
