package com.oops.review.day13;

public class UseAssociation {
	
	public static void main(String[] args) {
		
		Engine e = new Engine("", 125000, "SUV");
		
		Tyre t1 = new Tyre("MRF", 1500, "Steel");
		
		Tyre t2 = new Tyre("Apollo", 1350, "Alloy");
		
		Tyre t3 = new Tyre("Mercyline", 1450, "Alloy");
		
		Tyre t4 = new Tyre("Goodear", 1500, "Steel");
		
		Tyre [] ts = {t1, t2, t3, t4};
		
		Car c = new Car("Ford", 1250000, "Figo", "Red", e, ts);
//		System.out.println(c);
		System.out.println(e);
		System.out.println(c.getBrand()+" "+c.getPrice()+" "+c.getModel());
		for(Tyre ty: ts){
			System.out.println(ty);
		}
		
	}
}
