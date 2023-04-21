package com.lmsintro.day4;

public class UseWatch {

	public static void main(String[] args) {

		String[] s = args[0].split(",");

		Watch watch = new Watch();

		watch.brand = s[0];
		watch.colour = s[1];
		watch.price = Integer.parseInt(s[2]);

		System.out.println("Brand - " + watch.brand + ", Colour - " + watch.colour + ", Price - " + watch.price);

		String[] s1 = args[1].split(",");

		Watch watch1 = new Watch();

		watch1.brand = s1[0];
		watch1.colour = s1[1];
		watch1.price = Integer.parseInt(s1[2]);

		System.out.println("Brand - " + watch1.brand + ", Colour - " + watch1.colour + ", Price - " + watch1.price);

	}

}
