package com.conditions.day5;

public class CheckMinimumAge {

	public static void main(String[] args) {

		int age1 = 30;
		int age2 = 15;
		int age3 = 90;

		if (age1 < age2 && age1 < age3) {
			System.out.println(age1 + " is lesser age");
		} else if (age2 < age1 && age2 < age3) {
			System.out.println(age2 + " is lesser age");
		} else {
			System.out.println(age3 + " is lesser age");

		}

	}

}
