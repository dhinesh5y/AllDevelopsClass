package com.forloop.day6;

public class StringRevers {

	public static void main(String[] args) {
		
		String s = "dhinesh";
		String rev = "";
		for (int i=s.length()-1; i>=0; i--){
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
