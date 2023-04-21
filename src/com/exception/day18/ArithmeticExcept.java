package com.exception.day18;

public class ArithmeticExcept {

	public static void main(String[] args) {

		try {
			int a = 10;
			int b = 0;
			System.out.println(a / b);
		} 
		catch (ArithmeticException a) {
			System.out.println("Arithmetic Occurs");
		}
		System.out.println("Complete");
	}

}
