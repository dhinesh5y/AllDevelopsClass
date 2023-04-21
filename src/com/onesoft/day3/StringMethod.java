package com.onesoft.day3;

import org.omg.Messaging.SyncScopeHelper;

public class StringMethod {

	public static void main(String[] args) {
		
		String s = "One Soft";
		String s1 = " Technologies";
		
		String upper = s.toUpperCase();
		System.out.println(upper);
		System.out.println(s.toUpperCase()+"\n");
		
		String lower = s.toLowerCase();
		System.out.println(lower+"\n");
		
		int len = s.length();
		System.out.println("Length - "+len+"\n");
		
		boolean contains = s.contains("oft");
		System.out.println("Contains - "+contains+"\n");
		
		String substri = s.substring(5,7);
		System.out.println("SubString - "+substri+"\n");
		
		boolean startsWith = s.startsWith("One");
		System.out.println("Starts With - "+startsWith+"\n");
		
		boolean endsWith = s.endsWith("es");
		System.out.println("Ends With - "+endsWith+"\n");
		
		String concat = s.concat(s1);
		System.out.println(concat+"\n");
		
		String concat2 = s.concat(" Dhinesh");
		System.out.println(concat2+"\n");
		
		boolean equals = s.equals(s1);
		System.out.println("Equals - "+equals+"\n");
		
		boolean equalsIgnore = s.equalsIgnoreCase("ONE SOFT");
		System.out.println("EquIgnore - "+equalsIgnore+"\n");
		
		int indexOf = s.indexOf("S");
		System.out.println("IndexOf - "+indexOf+"\n");
		
		int lastIndexOf = s.lastIndexOf("O");
		System.out.println("LastIndexOf - "+lastIndexOf+"\n");
		
		char charAt = s.charAt(4);
		System.out.println("CharAt - "+charAt+"\n");
		
		char[] charArray = s.toCharArray();
		System.out.println("CharArray - "+charArray[4]+"\n");
		
		String[] split = s1.split("e");
		System.out.println("Split - "+split[1]+"\n");
		
		for (char string : charArray) {
			System.out.println(string);
		}
		
		
//		String s2 = "Copper";
//		
//		System.out.println(s2.toUpperCase());
//		
//		System.out.println(s2.toLowerCase());
//		
//		System.out.println(s2.length());
//		
//		System.out.println(s2.contains("e"));
//		
//		System.out.println(s2.startsWith("oc"));
//		
//		System.out.println(s2.endsWith("er"));
//		
//		System.out.println(s2.charAt(3));
//		
//		System.out.println(s2.indexOf("p"));
//		
//		System.out.println(s2.lastIndexOf("p"));
		
	}

}
