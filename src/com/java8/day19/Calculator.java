package com.java8.day19;

@FunctionalInterface
public interface Calculator {
	
	public int math(int a, int b);
	
	public static String evenNum(int a){
		if(a%2==0){
		return a+" Even Num";
		}
		else{
			return a+" Not Even Num";
		}
	}
}
