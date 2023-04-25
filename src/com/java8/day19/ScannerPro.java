package com.java8.day19;

import java.util.Scanner;

public class ScannerPro {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Name:");
		String name = s.nextLine();
		System.out.println("Age:");
		int age = s.nextInt();
		System.out.println("Email:");
		String email = s.next();
		System.out.println("Place:");
		String place = s.next();
		System.out.println("isMetro");
		boolean isMetro = s.nextBoolean();
		System.out.println("Mobile:");
		Long mob = s.nextLong();
		System.out.println("Height:");
		float hei = s.nextFloat();
		System.out.println("Weigth:");
		double wei = s.nextDouble();
		
	System.out.println("Name: "+name+" Age: "+age+" Email: "+email);
	System.out.println("Place: "+place+" IsMetro: "+isMetro+" Mobile: "+mob);
	System.out.println("Weight: "+wei+" Height: "+hei);
	}

}
