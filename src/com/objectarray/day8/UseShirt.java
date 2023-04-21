package com.objectarray.day8;

public class UseShirt {

	public static void main(String[] args) {

		Shirt s1 = new Shirt();
		s1.brand = "lenin";
		s1.color = "black";
		s1.isFullHand = true;
		s1.price = 700;

		Shirt s2 = new Shirt();
		s2.brand = "lenin";
		s2.color = "black";
		s2.isFullHand = false;
		s2.price = 800;

		Shirt s3 = new Shirt();
		s3.brand = "lenin";
		s3.color = "black";
		s3.isFullHand = false;
		s3.price = 900;

		Shirt s4 = new Shirt();
		s4.brand = "lenin";
		s4.color = "black";
		s4.isFullHand = true;
		s4.price = 850;

		Shirt s5 = new Shirt();
		s5.brand = "lenin";
		s5.color = "black";
		s5.isFullHand = true;
		s5.price = 750;

		Shirt[] shirts = { s1, s2, s3, s4, s5 };

		for (Shirt sh : shirts) {
			if (sh.isFullHand == true) {
				System.out.println(sh.price + 500);
			}
		}

	}

}
