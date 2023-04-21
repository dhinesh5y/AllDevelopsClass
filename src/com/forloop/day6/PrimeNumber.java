package com.forloop.day6;

public class PrimeNumber {

	public static void main(String[] args) {
	
		int num = 97;
		boolean prime = true;
		
		for (int i = 2; i <num; i++) {
			if (num%i==0){
				prime=false;
			}
		}
		if (prime==true) {
			System.out.println(num+" is prime number");
		}
		else {
			System.out.println(num+" is non prime number");
		}
	}

}
