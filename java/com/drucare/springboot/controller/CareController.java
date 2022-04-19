package com.drucare.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CareController {

//	@RequestMapping("/hello")
//	public String Hello() {
//		return "Hii! Nice to meet you";
//	}

	 @RequestMapping("/hello") public List<String> sayHello() { return
	 Arrays.asList("GoodDay", "Nice to meet you"); }
	}
