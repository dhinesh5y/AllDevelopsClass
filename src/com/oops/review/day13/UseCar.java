package com.oops.review.day13;

public class UseCar {

	public static void main(String[] args) {
		
		Bus b =  new Bus();
		System.out.println(b.findMilege(8)+" "+
		b.findCc(1200)+" "+
		b.findNetPrice(1250000));
		
		
		Bike b1 = new Bike();
		
		System.out.println(b1.findMilege(47)+" "+
		b1.findCc(5500)+" "+
		b1.findSpeed(120));
		
		
		Vehicle v = new Bus();
		
		System.out.println(v.findCc(1400)+" "+
		v.findMilege(7));
		
		
	}

}
