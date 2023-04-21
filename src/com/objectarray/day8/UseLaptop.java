package com.objectarray.day8;

public class UseLaptop {

	public static void main(String[] args) {
		
		Laptop l1 = new Laptop();
		l1.brand="Lenovo";
		l1.memory=4;
		l1.displaySize=14.5f;
		l1.price=30000;
		
		Laptop l2 = new Laptop();
		l2.brand="Sams";
		l2.memory=2;
		l2.displaySize=13.5f;
		l2.price=30000;
		
		Laptop l3 = new Laptop();
		l3.brand="Sony";
		l3.memory=8;
		l3.displaySize=14.5f;
		l3.price=30000;
		
		Laptop l4 = new Laptop();
		l4.brand="Hp";
		l4.memory=2;
		l4.displaySize=14.5f;
		l4.price=30000;
		
		Laptop l5 = new Laptop();
		l5.brand="Dell";
		l5.memory=6;
		l5.displaySize=14.5f;
		l5.price=30000;
		
		Laptop[] laptops = {l1, l2, l3, l4, l5};
		int count =0;
		for (Laptop  x : laptops) {
			if (x.memory>4) {
				
				System.out.println(x.brand+" "+x.displaySize+" Memory "+x.memory+" "+x.price);
			}
		}

	}

}
