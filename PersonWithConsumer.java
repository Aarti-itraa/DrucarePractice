package com.drucare.pojo;

import java.util.List;
import java.util.function.Consumer;

public class PersonWithConsumer {
	static Consumer<Person> c1 = (text)->System.out.println(text);
	static Consumer<Person> c2 = (text)->System.out.println(text.getName().toUpperCase());
	static Consumer<Person> c3 = (text)->System.out.println(text.getName().toLowerCase());
	
	static List<Person> personList = PersonRepository.getAllPersons();
	static List<String> hobby = PersonRepository.getPerson().getHobbies();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			/*c1.accept("Text Message");
			c2.accept("Text Message");
			c3.accept("Text Message");*/
				
			//c2.andThen(c3).accept("AND THAN");
			
			//personList.forEach(c2);
			
		//	personList.forEach(c3);
			
			System.out.println("--------------Name of Male having Salary above 4000--------------");
			getMaleWith4000AboveSalary();
			System.out.println("\n------------Name of Female having Swimming as their Hobby------------");
			femaleHavingHobbySwimming();
			System.out.println("\n------------Name of Person having Tennis as their Hobby-----------");
			personHavingHobby();
			
			System.out.println("\n------------Name of Person having Height  gt than 140-----------");
			personHavingHeight();
	}
	//Name of Male having Salary above 4000
	
	static void getMaleWith4000AboveSalary()
	{
		
		personList.forEach(text->{
			if(text.getGender().endsWith("MALE")&& text.getSalary()>4000)
			{
				c1.accept(text);
			}
		});
	}
	//Name of Female having Swimming as their Hobby
	static void femaleHavingHobbySwimming()
	{
		
		personList.forEach(text->{
			if(text.getGender().endsWith("FEMALE")&& text.getHobbies().contains("Swimming"))
			{
				c1.accept(text);
			}
		});
	}

	//Name of Person having Tennis as their Hobby
		static void personHavingHobby()
		{
			personList.forEach(text->{
				if(hobby.equals("Tennis"))
				{
					c1.accept(text);
				}
			});
		}
	
		//Name of Person having Tennis as their Hobby
				static void personHavingHeight()
				{
					personList.forEach(text->{
						if(text.getHeight()>140)
						{
							c1.accept(text);
						}
					});
				}
}
