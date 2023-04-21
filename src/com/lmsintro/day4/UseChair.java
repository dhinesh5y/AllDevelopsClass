package com.lmsintro.day4;

public class UseChair {

	public static void main(String[] args) {
		
		Chair chair = new Chair();
		
		chair.brand=args[0];
		chair.material=args[1];
		chair.price = Integer.parseInt(args[2]);
		chair.discount = Integer.parseInt(args[3]);
		int netAmount = (chair.price-chair.discount); 
		
		System.out.println("Brand - "+chair.brand+", Material - "+chair.material+", NetPrice - "+netAmount);
		
		

	}

}
