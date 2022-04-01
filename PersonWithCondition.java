package com.drucare.pojo;

import java.util.List;
import java.util.function.Consumer;

public class PersonWithCondition {

	
		static Consumer<Person> c1 = (per) -> System.out.println(per);
		static Consumer<Person> c2 = (per) -> 
		System.out.println(per.getName().toUpperCase());
		static List<Person> list=PersonRepository.getAllPersons();
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//		c1.accept("welcome to real consumer");
			//		c2.accept("welcome to real consumer");
			//		list.forEach(c1);
			//		list.forEach(c2);
			//		list.forEach(c1.andThen(c2));
			printWithCondition();
		}
		
		static void printWithCondition(){
			list.forEach(per ->{
				if((per.getKids()==2) && (per.getName().startsWith("A")) ){
					c1.andThen(c2).accept(per);
				}
			});
	}

}
