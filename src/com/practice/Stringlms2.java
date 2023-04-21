package com.practice;

public class Stringlms2 {

	public static void main(String[] args) {
		
		String s = "CREATE@Read@UPDATE@Delete";
		String[] words = s.split("@");
		boolean check = false;
		for(int i=0;i<words.length;i++) {
			words[i].toUpperCase();
			for(int j = 0;j<words[i].length();j++) {
				if(words[i].charAt(j)>='a' && words[i].charAt(j)<='z') {
					check = true;
					
				}
				else {
					check = false;
				}
			}
			if(check==true) {
				System.out.println(words[i]);
			}
			
		}

	}

}
