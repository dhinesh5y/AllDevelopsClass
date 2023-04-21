package com.primitivearray.day7;

public class Colours {

	public static void main(String[] args) {
		
		String [] color = {"Black", "White", "Green", "Blue", "Orange", "RedDarks"};
		
		for(int i=0; i<color.length; i++){
			System.out.println(color[i]);
		}
		System.out.println();
		
		for (int i =color.length-1; i >=0; i--) {
			System.out.println(color[i]);
		}
		System.out.println();
		
		for (int i = 0; i < color.length; i++) {
			System.out.println(color[i].charAt(0));			
		}
		System.out.println();
		
		for (int i = 0; i < color.length; i++) {
			System.out.println(color[i].charAt(color[i].length()-1));
		}
		System.out.println();
		
		for (int i = 0; i < color.length; i++) {
			System.out.println(color[i].charAt(i));
			
		}

	}

}
