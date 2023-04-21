package com.forloop.day6;

public class PrintNumAverage {

	public static void main(String[] args) {
		
		int num = 15;
		int add = 0;
		int count =0;
		
		for (int i=1; i<=num; i++) {
			add=add+i;
			count=count+1;
		}
		System.out.println("Average is "+(add/count));
	}

}
