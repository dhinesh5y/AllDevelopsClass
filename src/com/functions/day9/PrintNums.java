package com.functions.day9;

public class PrintNums {
	
	//public int number (int [] a){
	public int number (){
		int[] a = {12, 85, 24, 45};
		 int max = 0; 
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max){
				max=a[i];
			}
		}return max;
	}

	public static void main(String[] args) {
		PrintNums p = new PrintNums();
		int[] a = {12, 85, 24, 45};
		//System.out.println(p.number(a));
		System.out.println(p.number());
	}

}
