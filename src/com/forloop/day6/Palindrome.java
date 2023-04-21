package com.forloop.day6;

public class Palindrome {

	public static void main(String[] args) {
		
		String s = "madam";
		String rev = "";
		for (int i=s.length()-1; i>=0; i--){
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		if (rev.equals(s)) {
			System.out.println(s+" is palindrome");
		}
		else {
			System.out.println(s+" is not palindrome");
		}

	}

}
