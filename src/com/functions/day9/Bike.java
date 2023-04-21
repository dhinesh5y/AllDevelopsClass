package com.functions.day9;

public class Bike {
	String registration;
	String brand;
	int price;
	
	void findMaxPrice(Bike[]a){
		Bike temp=null;
		int max =0;
		for (Bike bike : a) {
			if (bike.price>=max) {
				max=bike.price;
				temp=bike;
			}
		}
		System.out.println(temp.brand+" "+temp.price+" "+temp.registration);
	}

}
