package com.forloop.day6;

public class PrintNumFactorial {

	public static void main(String[] args) {
		
		int input = 8; // factorial
		int fact = 1;
		for (int i=1; i<=input; i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
