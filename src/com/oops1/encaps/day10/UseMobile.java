package com.oops1.encaps.day10;

public class UseMobile {

	public static void main(String[] args) {
		
		Battery b = new Battery();
		b.setIsLithium(true);
		b.setCapacity(5000);
		
		Mobile m = new Mobile();
		m.setBattery(b);
		m.setBrand("Samsung");
		m.setIsTypeC(true);
		m.setPrice(12000);
		
		System.out.println(m.getBrand()+" "+m.getIsTypeC()+" "+m.getBattery().getIsLithium());
		
	}

}
