package com.oops2.Iherit.poly.day11;

public class Car {
	
	String barnd;
	int price;
	String model;
	
	public int findNetPrice (int tax) {
		return price+(price*tax/100);
	}

}
