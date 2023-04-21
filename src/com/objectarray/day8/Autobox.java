package com.objectarray.day8;

public class Autobox {

	public static void main(String[] args) {
		
		String [] words = {"Java", "ONESOFT", "Green", "TECH"};
		
		for (int i = 0; i < words.length; i++) {
			if (words[i].toLowerCase()==words[i]) {
				System.out.println(words[i]);
			}
		}
		
		

	}

}
