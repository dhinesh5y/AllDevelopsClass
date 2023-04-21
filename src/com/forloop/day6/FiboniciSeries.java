package com.forloop.day6;

public class FiboniciSeries {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 0;
		
		for (int i =0; i<=7; i++){
			System.out.println(a);
			a=b;
			b=a+c;
			c=a;
			
		}
		

	}

}
