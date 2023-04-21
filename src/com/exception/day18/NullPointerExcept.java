package com.exception.day18;

public class NullPointerExcept {

	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.charAt(8));
		}
		catch (NullPointerException a) {
			System.out.println("Null Pointer Occurs");
		}
		System.out.println("Complete");
	}

}
