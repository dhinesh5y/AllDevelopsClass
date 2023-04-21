package com.objectarray.day8;

public class UseMobile {

	public static void main(String[] args) {
		
		Mobile m1 = new Mobile();
		m1.brand="vivo";
		m1.color="black";
		m1.price= 10000;
		
		Mobile m2 = new Mobile();
		m2.brand="oppo";
		m2.color="green";
		m2.price= 9000;
		
		Mobile m3 = new Mobile();
		m3.brand="sony";
		m3.color="red";
		m3.price= 8000 ;
		
		Mobile m4 = new Mobile();
		m4.brand="redmi";
		m4.color="white";
		m4.price= 8500;
		
		Mobile m5 = new Mobile();
		m5.brand="oneplus";
		m5.color="blue";
		m5.price= 9500;
		
		Mobile m6 = new Mobile();
		m6.brand="samsung";
		m6.color="ash";
		m6.price= 10500;
		
		Mobile m7 = new Mobile();
		m7.brand="iphone";
		m7.color="gold";
		m7.price= 11000;
		
		Mobile [] mobiles = {m1, m2, m3, m4, m5, m6, m7};
		
		for (int i = 0; i < mobiles.length; i++) {
			System.out.println(mobiles[i].brand+" "+mobiles[i].color+" "+mobiles[i].price);
			
			
		}
		
	}

}
