package com.functions.day9;

public class Calculator3 {
	
	public void add () {
		int a = 20;
		int b = 15;
		boolean compare = a>b;
		System.out.println(compare);
	}
	
	public void sub (int a , String b){
		System.out.println(a+""+b);
	}

	public static void main(String[] args) {
		
		Calculator3 c = new Calculator3();
		c.add();
		
		c.sub(31, " Dhinesh");
		c.sub(25, " Value");
	}

}
