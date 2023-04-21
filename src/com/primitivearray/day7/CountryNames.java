package com.primitivearray.day7;

import javax.sound.midi.Synthesizer;

public class CountryNames {

	public static void main(String[] args) {
		
		String[] names = new String[8];
		names[0] = "asia";
		names[1] = "poland";
		names[2] = "ukraine";
		names[3] = "thailand";
		names[4] = "malasiya";
		names[5] = "india";
		names[6] = "sweedan";
		names[7] = "canada";
		
		for (int i = 0; i < names.length; i++) {
			if(names[i].charAt(names[i].length()-1)=='a'){
				System.out.println(names[i]);
			}
		}
		System.out.println();
		
		for (int i = 0; i < names.length; i++) {
			if(names[i].contains("a")||names[i].contains("e")||names[i].contains("i")||names[i].contains("o")||names[i].contains("u")){
				System.out.println(names[i]+" - it have vowel");
			}
		}
		System.out.println();
		
		for (int i = 0; i < names.length; i++) {
			if(i%2!=0){
				System.out.println(names[i]);
			}
		}
		System.out.println();
		for (int i = 0; i < names.length; i++) {
			if(!names[i].startsWith("i")){
				System.out.println(names[i]);
			}
		}
		System.out.println();
		
		for (int i = 0; i < names.length; i++) {
			if(names[i].length()>6){
				System.out.println(names[i]);
				
			}
		}
		
		

	}

}
