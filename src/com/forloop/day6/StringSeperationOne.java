package com.forloop.day6;

public class StringSeperationOne {

	public static void main(String[] args) {
		
		String s = "Dhineshraj Native Kumbakonam";
		String s2= "";
		for (int i=0; i<(s.length()/2); i++) {
			s2=s2+s.charAt(i);
		}
		System.out.println(s2);

	}

}
