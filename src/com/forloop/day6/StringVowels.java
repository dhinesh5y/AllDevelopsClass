package com.forloop.day6;

public class StringVowels {

	public static void main(String[] args) {

		String s = "dhinesh oua";

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'||s.charAt(i)=='u') {

				System.out.println("Vowels "+s.charAt(i));
			}

		}
	}

}
