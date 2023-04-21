package com.onesoft.day2;

public class UseShirt {

	public static void main(String[] args) {
		Shirt s = new Shirt();

		s.brand = "AllenSolley";
		s.price = 1500;
		s.size = 'L';
		s.barcodeNum = 857496415263l;
		s.neckSize = 5.5f;
		s.isFullHand = true;

		
		Shirt s1 = new Shirt();

		s1.brand = "PeterEngland";
		s1.price = 1399;
		s1.size = 'M';
		s1.barcodeNum = 415263748596l;
		s1.neckSize = 5.3f;
		s1.isFullHand = false;
		
		System.out.println(s.brand + "\n" + s.price + " " + s.size + "\n" + s.barcodeNum + "\n" + s.neckSize + " " + s.isFullHand);
		
		System.out.println(" ");

		System.out.println(s1.brand + "\n" + s1.price + " " + s1.size + "\n" + s1.barcodeNum + "\n" + s1.neckSize + " " + s1.isFullHand);

	}

}
