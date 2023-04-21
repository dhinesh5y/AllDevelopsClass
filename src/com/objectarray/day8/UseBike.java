package com.objectarray.day8;

public class UseBike {

	public static void main(String[] args) {
		
		Bike b1= new Bike();
		b1.registration="TN11 AR5271";
		b1.brand="honda";
		b1.price=80000;
		
		Bike b2= new Bike();
		b2.registration="AP25 AR5271";
		b2.brand="hond";
		b2.price=80000;
		
		Bike b3= new Bike();
		b3.registration="AP05 AR5271";
		b3.brand="honda";
		b3.price=80000;
		
		Bike b4= new Bike();
		b4.registration="TN07 AR5271";
		b4.brand="hero";
		b4.price=85000;
		
		Bike[] bikes = {b1, b2, b3, b4};
		
		for (Bike bike : bikes) {
			if (bike.registration.contains("TN")) {
				System.out.println(bike.brand+" "+bike.registration+" "+bike.price);
			}
		}
		

	}

}
