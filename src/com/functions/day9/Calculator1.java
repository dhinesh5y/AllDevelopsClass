package com.functions.day9;

public class Calculator1 {

	int sub(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		Calculator1 c = new Calculator1();
		System.out.println(c.sub(20, 5));
		System.out.println(c.sub(25, 7));

	}

}
