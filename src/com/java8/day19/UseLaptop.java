package com.java8.day19;

public class UseLaptop {

	public static void main(String[] args) {
		Laptop dell = (x)->{
			if(x>50000){
				return x+" lenovo";
			}
			else{
				return x +" Dell";
			}
			
		};
		System.out.println(dell.price(40000));
	}

}
