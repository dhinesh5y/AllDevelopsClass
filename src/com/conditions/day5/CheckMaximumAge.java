package com.conditions.day5;

public class CheckMaximumAge {

	public static void main(String[] args) {

		int age1 = 70;
		int age2 = 25;
		int age3 = 71;

		if (age1 > age2 && age1 > age3) {
			System.out.println(age1 + " is greater");
		} else if (age2 > age1 && age2 > age3) {
			System.out.println(age2 + " is greater");
		} else {
			System.out.println(age3 + " is greater");
		
		}

	}

}
