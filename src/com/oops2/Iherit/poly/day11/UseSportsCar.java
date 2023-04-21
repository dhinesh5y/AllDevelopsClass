package com.oops2.Iherit.poly.day11;

public class UseSportsCar extends SportsCar {

	public static void main(String[] args) {
		
		SportsCar sc = new SportsCar();
		sc.barnd="Honda";
		sc.price=650000;
		sc.model="City";
		sc.spped=120;
		System.out.println(sc.findNetPrice(10));
		System.out.println(sc.barnd+" "+sc.spped);
	}

}
