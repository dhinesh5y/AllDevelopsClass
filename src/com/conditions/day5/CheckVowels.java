package com.conditions.day5;

public class CheckVowels {

	public static void main(String[] args) {
		
		String s = "dog";
		
		if (s.contains("a")||s.contains("e")||s.contains("i")||s.contains("o")||s.contains("u")) {
			System.out.println(s+" its contains by vowels");
			
		} else {
			System.out.println(s+" its not contains by vowels");
		}

	}

}
