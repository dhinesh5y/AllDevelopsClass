package com.forloop.day6;

public class StringUpperCaseCount {

	public static void main(String[] args) {
		
		String s = "RaJarAm";
		int count =0;
		for (int i=0;i<s.length(); i++) {
			if (s.charAt(i)>='A'&&s.charAt(i)<='Z') {
				System.out.println(s.charAt(i));
			}
			else {
				count++;
			}
		}
		System.out.println("Lower Case Count - "+count);
		
		
	}

}
