package com.drucare.pojo;

import java.util.List;
import java.util.function.BiConsumer;

public class PersonWithBIConsumer {

		static List<Person> personList = PersonRepository.getAllPersons(); 
		static BiConsumer<String, List<String>> hobby = (names, hobbies) ->System.out.println("Name is "+names +" & Hobbies are "+hobbies);
		
		static BiConsumer<String, Double> income = (names, salary) ->System.out.println("Name is "+names +" & salary is "+salary);
			
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("-------Person with their Hobby--------");
			fetchHobbies();
			System.out.println("\n------Person with their Salary--------");
			fetchIncome();
					
	}
		
		static void fetchHobbies(){
			personList.forEach(person->{hobby.accept(person.getName(),person.getHobbies());
				});
			}
				
		
		static void fetchIncome(){
			personList.forEach(person->{income.accept(person.getName(),person.getSalary());
				});
			}
		}
