package com.example.demo;

import org.springframework.stereotype.Component;

@Component("IC")
public class InternetConnection {

	private int speed;
	private String connetionName;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getConnetionName() {
		return connetionName;
	}
	public void setConnetionName(String connetionName) {
		this.connetionName = connetionName;
	}
	
	public void netConnection()
	{
		System.out.println("Internet Connected.....");
	}
}
