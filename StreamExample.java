package com.drucare.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<Integer> stream = Stream.of(new Integer[]{11,22,33,44,55,66,77,88,99});
		stream.forEach(p->System.out.println(p));
		
		IntStream.range(1, 9).forEach(System.out::println);
		System.out.println();
		
		//skip
		System.out.println("\nSkip 4\n");
		IntStream.range(1, 10).skip(4).forEach(System.out::println);
		System.out.println();
		
		//sum
		System.out.println("Sum");
		System.out.println(IntStream.range(1, 10).sum());
		
		//sorted Names & Print the first Name
		System.out.println("Sort Names & Print First");
		Stream.of("Anu","Anil","Arun").sorted().findFirst().ifPresent(System.out::println);
		
		//Name starting with C
		System.out.println("\n Name starting With C");
		String names[]={"Anu","Anil","Arun","Ajay","Amit", "Adi","Bob", "Ben","Charle"};
		Arrays.stream(names).filter(n->n.startsWith("C")).forEach(System.out::println);
		
		//squaring value
				System.out.println("\n Squaring value");
				Arrays.stream(new int[]{2,3,4,5,6}).map(n->n*n).average().ifPresent(System.out::println);
				
				
				//Names to Lower case
				System.out.println("\n Name in Lower case");
				String name[]={"Anu","Anil","Arun","Ajay","Amit", "Adi","Bob", "Ben","Charle"};
				Arrays.stream(name).map(n->n.toLowerCase()).forEach(System.out::println);;
		
		}
		
	

}
