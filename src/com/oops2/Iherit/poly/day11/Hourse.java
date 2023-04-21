package com.oops2.Iherit.poly.day11;

public class Hourse extends Animal {
	
	String hourseName;
	
	public int findHourseNetPrice(int tax){
		return price+(price*tax/100);
	}

}
