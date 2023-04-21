package com.conditions.day5;

public class CheckGreetinhTime {

	public static void main(String[] args) {

		int time = 5;

		if (time >= 0 && time <= 40) {
			System.out.println(time + "Good Morning");

		} else if (time > 40 && time <= 60) {
			System.out.println(time + "Good Afternoon");
		} else if (time > 60 && time <= 80) {
			System.out.println(time + "Good Evening");
		} else {
			System.out.println("Good Night");
		}

	}

}
