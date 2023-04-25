package com.java8.day19;

public class UseSportsBike {

	public static void main(String[] args) {
		
		SportsBike sb = new SportsBike();
		sb.findNetPrice();
		Bike.brand(); // direct call from interface
		sb.brand();

	}

}
