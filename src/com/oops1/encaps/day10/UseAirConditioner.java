package com.oops1.encaps.day10;

public class UseAirConditioner {

	public static void main(String[] args) {
		
		Compressor c = new Compressor();
		c.setType("Cooper");
		c.setIsWarranty(true);
		c.setPhase(1);
		
		AirConditioner a = new AirConditioner();
		a.setBrand("LG");
		a.setCompressor(c);
		a.setIsSplit(true);
		a.setPrice(25000);
		System.out.println(a.getBrand()+" "+a.getCompressor().getType());
	}

}
