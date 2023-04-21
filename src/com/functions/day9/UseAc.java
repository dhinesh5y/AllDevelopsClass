package com.functions.day9;

public class UseAc {

	public static void main(String[] args) {
		
		Ac ac1 = new Ac();
		ac1.brand="Voltos";
		ac1.price=36000;
		ac1.ton=1.5f;
		
		Ac ac2 = new Ac();
		ac2.brand="LG";
		ac2.price=37000;
		ac2.ton=1.5f;
		
		System.out.println(ac2.fidMaxPrice(ac1, ac2));
		
		

	}

}
