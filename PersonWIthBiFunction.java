package com.drucare.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class PersonWIthBiFunction {
	static BiFunction<String, String, String> bf1 = (a,b) -> (a+" "+b); //arg,arg,Return type

	static Predicate<Person> p1 = person -> person.getHeight() <= 140;

	static Predicate<Person> p2 = person -> person.getGender().equals("FEMALE");

	static BiFunction<List<Person>, Predicate<Person>, Map<String,Double>> bf2 = (listOfPersons, predicate) -> {
		Map<String,Double> map = new HashMap<String,Double>();
		listOfPersons.forEach(person -> {
			if(p1.and(predicate).test(person))
				map.put(person.getName(), person.getSalary());
		});
		return map;
	};

	public static void main(String[] args) {
		List<Person> personList = PersonRepository.getAllPersons();
		Map<String,Double> map = bf2.apply(personList,p2);
		System.out.println(map);
	}
}

