package com.example.demo;
import com.example.demo.Home;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Demo1Application.class, args);
		Home h= new Home(); // tightly coupled
		Home h1=context.getBean(Home.class);	//loosely coupled
		h1.connection();
	
		 
	
	}

}
