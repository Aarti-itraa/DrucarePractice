package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="singleton")
public class Home {

	private String ownerName;
	private int houseNo;
	@Autowired
	@Qualifier("IC")
	InternetConnection ic;
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	
	Home()
	{
		System.out.println("Home Constructor");
	}
	
	public void connection()
	{
		System.out.println("Connection Successfully.....");
		ic.netConnection();
	}
	public InternetConnection getIc() {
		return ic;
	}
	public void setIc(InternetConnection ic) {
		this.ic = ic;
	}
	
	
}
