package com.forloop.day6;

public class PrintNumCount {

	public static void main(String[] args) {
		int count=0;
		for(int i =3; i<10; i++) {
			
			if(i%2!=0){
			count=i+1;
		}
		}
		System.out.println("Number Count "+count);

	}

}
