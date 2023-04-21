package com.exception.day18;

public class StringIndexOutOfBoundsExcept {

	public static void main(String[] args) {

		try {
			String s = "Dhinesh";
			System.out.println(s.charAt(8));
		}
		catch (StringIndexOutOfBoundsException a) {
			System.out.println("String Index Out Of Bounds Occurs");
		}
		System.out.println("Complete");
	}

}
