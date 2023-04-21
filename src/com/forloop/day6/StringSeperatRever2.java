package com.forloop.day6;

public class StringSeperatRever2 {

	public static void main(String[] args) {
		
		String s = "Dhineshraj Native Kumbakonam";
		String s2= "";
		for (int i=(s.length()-(s.length()/2)); i<(s.length()); i++) {
			s2=s2+s.charAt(i);
		}
		System.out.println(s2);

	}

}
