package com.functions.day9;

public class Voters {

	String voterAge(int age) {
		if (age > 18) {
			return "eligible";
		} else {
			return "not eligible";
		}
	}

	void greaterAge() {
		int age1 = 25;
		int age2 = 17;
		int age3 = 28;
		if (age1 > age2 && age1 > age3) {
			System.out.println(age1 + " is greater");
		} else if (age2 > age1 && age2 > age3) {
			System.out.println(age2 + " is greater");
		} else {
			System.out.println(age3 + " is greater");
		}
	}
	
	void day (int day){
		switch (day) {
		case 1: System.out.println("Sunday");
		break;
		case 2: System.out.println("Tuesday");
		break;
		case 3: System.err.println("Wednesday");
		
		}
	}
	
	

	public static void main(String[] args) {
		Voters v = new Voters();
		System.out.println(v.voterAge(25));
		v.greaterAge();
		v.day(2);

	}

}
