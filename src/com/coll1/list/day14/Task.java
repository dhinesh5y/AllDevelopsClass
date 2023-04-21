package com.coll1.list.day14;

import java.util.ArrayList;

public class Task {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<>();
		
		words.add("Ten");
		words.add("Twenty");
		words.add("Thirty");
		words.add("Frty");
		words.add("Fifty");
		words.add("Sixty");
		
		for (int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i));
		}
		System.out.println(" ");
		for (int i = words.size()-1; i >=0; i--) {
			System.out.println(words.get(i));
		}
		System.out.println(" ");
		for (String st : words) {
			System.out.println(st);
		}
		System.out.println(" ");
		words.forEach(x->System.out.println(x));
		System.out.println(" ");
		for (int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i).charAt(words.get(i).length()-1));				
		}
		System.out.println(" ");
		words.forEach(string->{
			if(string.contains("a")||string.contains("e")||string.contains("i")||string.contains("o")||string.contains("u")){
				System.out.println(string);
			}
		});
		
		
		
	}

}
