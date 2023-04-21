package com.testday1;

public class TestDay1 {

	public static void main(String[] args) {

		String personName = "Dhinesh";
		int height = 180;
		float weight = 75.5f;
		
		double bmi = 45.5;

		System.out.println(personName + " - BMI - " +(weight/(height*height)));

	}
}