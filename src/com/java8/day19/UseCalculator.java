package com.java8.day19;

public class UseCalculator {

	public static void main(String[] args) {
		
		Calculator add = (x,y)->x+y;
		System.out.println(add.math(10, 2));
		Calculator sub = (x,y)->x-y;
		System.out.println(sub.math(10, 2));
		Calculator mul = (x,y)->x*y;
		System.out.println(mul.math(10, 2));
		Calculator div = (x,y)->x/y;
		System.out.println(div.math(10, 2));
		
		
		System.out.println(Calculator
				
				.evenNum(15));
	}

}
