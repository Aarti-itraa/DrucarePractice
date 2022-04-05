package com.drucare.pojo;

import java.util.List;
import java.util.function.Predicate;

public class PersonWithPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Person> predicateHeight = person ->person.getHeight()<140;
		
		Predicate<Person> predicateGender = person ->person.getGender().equalsIgnoreCase("female");
		
		Predicate<Person> predicateSalary =person ->person.getSalary()>3000;
		
		Predicate<Person> predicateKids =person ->person.getKids()==2;

		Predicate<Person> predicateName =person ->person.getName().startsWith("H");

		Predicate<Person> predicateName1=person ->person.getName().endsWith("an");

		Predicate<Person> predicateHobby=person ->person.getHobbies().contains(" Tennis");

		List<Person> personList = PersonRepository.getAllPersons();
		
		
		System.out.println("Female Person having Height below 140 cm\n ");
		personList.forEach(person->{
			if(predicateHeight.and(predicateGender).test(person))
				System.out.println(person);
		});
		
		System.out.println("\n Female Person having salary above 3000 \n");
		personList.forEach(person1->{
			if(predicateGender.and(predicateSalary).test(person1))
				System.out.println(person1);
		});
		
		System.out.println("\n Person having 2 kids \n");
		personList.forEach(person1->{
			if(predicateKids.test(person1))
				System.out.println(person1);
		});
		
		System.out.println("\n Person's name starting wih 'H' \n");
		personList.forEach(person1->{
			if(predicateName.test(person1))
				System.out.println(person1);
		});
		
		System.out.println("\n Person's name endswith 'an' \n");
		personList.forEach(person1->{
			if(predicateName1.test(person1))
				System.out.println(person1);
		});
		
		
		System.out.println("\n Person having Tennis as a Hobby \n");
		personList.forEach(person1->{
			if(predicateHobby.test(person1))
				System.out.println(person1);
		});
		
			}

}
 