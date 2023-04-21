package com.primitivearray.day7;

public class LettersProgram {

	public static void main(String[] args) {
		
		String word = "Pepper";
		
		char[] letter = word.toCharArray();
		
		for (int i = 0; i < letter.length; i++) {
			System.out.print(letter[i]);
		}
		System.out.println("\n");
		String rev = "";
		for (int i = letter.length-1; i >=0; i--) {
			
			rev=rev+letter[i];
		}
		System.out.println(rev);
		System.out.println();
		
		int count = 0;
		int vowcount = 0;
		for (int i = 0; i < letter.length; i++) {
			if (letter[i]=='P'||letter[i]=='p') {
				count=count+1;
			}
			if(letter[i]=='a'||letter[i]=='e'||letter[i]=='i'||letter[i]=='o'||letter[i]=='u'){
				vowcount=vowcount+1;
			}
			
		}
		System.out.println("'p' count - "+count);
		
		System.out.println("vowel count - "+vowcount);
		
	
		

	}

}
