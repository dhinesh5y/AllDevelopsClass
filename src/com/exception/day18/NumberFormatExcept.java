package com.exception.day18;

public class NumberFormatExcept {

	public static void main(String[] args) {

		try {
			String s = "15a";
			System.out.println(Integer.parseInt(s));
		} 
		catch (NumberFormatException a) {
			System.out.println("Number Format Occurs");
		}
		System.out.println("Complete");
	}

}
