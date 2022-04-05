package com.drucare.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class PersonWithFunction {

	static Function<String, Integer> f1 = name -> name.length();
	static Predicate<Person> p = person -> person.getHeight() <= 140;
	static Predicate<Person> p1 = person -> person.getGender().equals("FEMALE");

	static Function<List<Person>, Map<String, Double>> ff = personList -> {
		Map<String, Double> map = new HashMap<String, Double>();
		personList.forEach(person -> {
			if (p.and(p1).test(person))
				map.put(person.getName(), person.getSalary());
		});
		return map;
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(f1.apply("Hello World"));
		List<Person> personList = PersonRepository.getAllPersons();
		Map<String, Double> map = ff.apply(personList);
		System.out.println(map);

	}

}
