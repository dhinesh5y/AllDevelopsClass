package com.functions.day9;

public class Calculator {

	public int add() {
		int a = 5;
		int b = 10;
		return a + b;
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add());
	}

}
