package com.oops2.Iherit.poly.day11;

public class Dog extends Animal {
	
	String dogName;
	
	public int findDogPrice(int tax){
		return price+(price*tax/100);
	}
	

}
