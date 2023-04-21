package com.conditions.day5;

public class UseBags {

	public static void main(String[] args) {
		
		Bag b1 = new Bag ();
		b1.color="Black";
		b1.price=250;
		b1.noOfZips=2;
		
		Bag b2 = new Bag ();
		b2.color="Red";
		b2.price=325;
		b2.noOfZips=3;
		
		if (b1.price>b2.price) {
			System.out.println(b1.price+" is greater price");
			
		} else {
			System.out.println(b2.price+" is greater price");

		}

	}

}
