package com.drucare.pojo;

import java.util.List;
import java.util.function.BiPredicate;

public class PersonWithBiPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<Integer, String> heightAndGender = (height, gender) -> height >= 120 && gender.equals("MALE");

		BiPredicate<Double, String> salaryAndName = (salary, name) -> salary >=3000 && name.startsWith("A");

		BiPredicate<Integer, List<String>> kidsAndHobby = (kids, hobby) -> kids ==2 && hobby.contains(" Tennis");

		List<Person> personList = PersonRepository.getAllPersons();

		System.out.println("Person with Height above 120 and Gender as MALE\n ");
		personList.forEach(person -> {if(heightAndGender.test(person.getHeight(), person.getGender()))
		System.out.println(person);
				
		});
			System.out.println("\nPerson with Salary above 3000 and Name starting with A");
		
		personList.forEach(person1 -> {if(salaryAndName.test(person1.getSalary(), person1.getName()))
			System.out.println(person1);
					
			});
		
System.out.println("\nPerson having 2 kids and Hobby as Tennis");
		
		personList.forEach(person2 -> {if(kidsAndHobby.test(person2.getKids(),person2.getHobbies()))
			System.out.println(person2);
					
			});
	}

}
