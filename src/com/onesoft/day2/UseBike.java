package com.onesoft.day2;

public class UseBike {
	
	public static void main(String[] args) {
		
		Bike b = new Bike();
		
		b.brand="Honda";
		b.price=100000;
		b.colour="Blue";
		b.isAlloyWheel=true;
		b.engineCC=124.7f;
		b.batteryType='C';
		
		System.out.println(b.brand+" "+b.price+"\n"+b.colour+" "+b.isAlloyWheel+"\n"+b.engineCC+" "+b.batteryType);
	}

}
