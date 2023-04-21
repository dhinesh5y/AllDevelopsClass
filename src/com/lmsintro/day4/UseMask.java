package com.lmsintro.day4;

public class UseMask {

	public static void main(String[] args) {
		
		Mask mask = new Mask ();
		
		mask.price = Integer.parseInt(args[0]);
		mask.brand = args[1];
		mask.color = args[2];
		
		System.out.println(mask.price+","+mask.brand+","+mask.color);

	}

}
