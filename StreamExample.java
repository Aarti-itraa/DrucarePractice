package com.drucare.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Stream<Integer> stream = Stream.of(new Integer[] { 11, 22, 33, 44, 55, 66, 77, 88, 99 });
		stream.forEach(p -> System.out.println(p));

		IntStream.range(1, 9).forEach(System.out::println);
		System.out.println();

		// skip
		System.out.println("\nSkip 4\n");
		IntStream.range(1, 10).skip(4).forEach(System.out::println);
		System.out.println();

		// sum
		System.out.println("Sum");
		System.out.println(IntStream.range(1, 10).sum());

		// sorted Names & Print the first Name
		System.out.println("Sort Names & Print First");
		Stream.of("Anu", "Anil", "Arun").sorted().findFirst().ifPresent(System.out::println);

		// Name starting with C
		System.out.println("\n Name starting With C");
		String names[] = { "Anu", "Anil", "Arun", "Ajay", "Amit", "Adi", "Bob", "Ben", "Charle" };
		Arrays.stream(names).filter(n -> n.startsWith("C")).forEach(System.out::println);

		// squaring value
		System.out.println("\n Squaring value");
		Arrays.stream(new int[] { 2, 3, 4, 5, 6 }).map(n -> n * n).average().ifPresent(System.out::println);

		// Names to Lower case
		System.out.println("\n Name in Lower case");
		String name[] = { "Anu", "Anil", "Arun", "Ajay", "Amit", "Adi", "Bob", "Ben", "Charle" };
		Arrays.stream(name).map(n -> n.toLowerCase()).forEach(System.out::println);
		;

		/*// Fetch data from file
		Stream<String> fileList1 = Files.lines(Paths.get("Note.txt"));
		fileList1.sorted().filter(f -> f.length() > 10).collect(Collectors.toList()).forEach(System.out::print);
		fileList1.close();

		// Access from Singh suffix File data
		List<String> fileList2 = Files.lines(Paths.get("Note.txt")).filter(f -> f.contains("Singh"))
				.collect(Collectors.toList());
		System.out.println("\nFetching names from files having Singh in their name");
		fileList2.forEach(System.out::print);*/
		
		//Reduction -sum
		double total=Stream.of(1.1,5.5,6.77).reduce(0.0	,(Double a, Double b)->a+b);
		System.out.println("\nTotal = "+total);
		
		//Reduction - Summary Statistic
		IntSummaryStatistics iss =IntStream.of(4,5,66,11,28,7).summaryStatistics();
		System.out.println("\nCounting the summary of the given statistic : "+iss);
		

	}

}
