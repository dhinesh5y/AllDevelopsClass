package com.functions.day9;

public class Ac {
	
	String brand;
	int price;
	float ton;
	
	String fidMaxPrice(Ac a, Ac b){
		if (a.price<b.price) {
			return a.brand;
		}else{
			return b.brand;
		}
	}

}
