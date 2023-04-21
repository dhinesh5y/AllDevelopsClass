package com.practice;

public class StringReverse {

	public static void main(String[] args) {
		
	int num = 7;
	boolean prime = true;
	
	for (int i=0; i<num; i++){
		if (num%i==0){
			prime=false;
		}
	}
	if (prime == true) { 
		System.out.println(num+" is prime");
		
	}else {
		System.out.println(num+" is non prime");
	}
	
	
	}

}
