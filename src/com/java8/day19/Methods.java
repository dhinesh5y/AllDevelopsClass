package com.java8.day19;

public class Methods {

	public static void findMax(int[] a) {
		int max = a[0];
		for (Integer x : a) {
			if (x > max) {
				max = x;
			}
		}
		System.out.println(max + " max number");
	}

	public static void findMinStringLen(String[] a) {
		int minLen = a[0].length();
		String temp = null;
		for (String x : a) {
			if (x.length() <= minLen) {
				minLen = x.length();
				temp=x;				
			}
		}
		System.out.println(temp+" "+minLen+ " min String");
	}

}
