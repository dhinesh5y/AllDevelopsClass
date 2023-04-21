package com.onesoft.day1;

public class Comparision {

	public static void main(String[] args) {
		
		int num1 = 15;
		int num2 = 5;
		
		boolean less = num1<num2;
		boolean lessEq = num1<=num2;
		boolean great = num1>num2;
		boolean greatEq = num1>=num2;
		boolean equal = num1==num2;
		boolean notEq = num1!=num2;
		
		System.out.println("Lessthan - "+less);
		System.out.println("Lessthan or equal to - "+lessEq);
		System.out.println("Greaterthan - "+great);
		System.out.println("Greaterthan or equal to - "+greatEq);
		System.out.println("Equal to - "+equal);
		System.out.println("Not Equal to - "+notEq);
	}

}
