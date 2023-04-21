package com.primitivearray.day7;

public class StringArrayReverse {

	public static void main(String[] args) {
		
		String[] words = {"sun","moon","earth"};
		
		String []rev1 = {};
		String rev2 ="";
		for (int i = 0; i < words.length; i++) {
			
			rev2 = "";
			for (int j =words[i].length()-1; j >=0; j--) {
				rev2=rev2+words[i].charAt(j);
				
			}
			System.out.println(rev2);

		}
		
	}

}
