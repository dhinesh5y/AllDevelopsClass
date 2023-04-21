package com.conditions.day5;

public class CheckDirection {

	public static void main(String[] args) {

		String direction = "South";

		if (direction.charAt(0) == 'S') {
			System.out.println("South");
		} else if (direction.charAt(0) == 'E') {
			System.out.println("East");
		} else if (direction.charAt(0) == 'W') {
			System.out.println("West");
		} else if (direction.charAt(0) == 'N') {
			System.out.println("North");
		} else {
			System.out.println("Invalid");
		}

	}

}
