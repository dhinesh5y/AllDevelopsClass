package com.exception.day18;

public class TestException {

	public static void main(String[] args) throws PriceException {
		
		
			Shirt s1 = new Shirt();
			s1.brand = "Arrow";
			s1.price = 1310;
			s1.color = "White";
			s1.size = 42;
			
			Shirt s2 = new Shirt();
			s2.brand = "xyz";
			s2.price = 2750;
			s2.color = "Red";
			s2.size = 44;
			
			Shirt s3 = new Shirt();
			s3.brand = "seri";
			s3.price = 2850;
			s3.color = "Green";
			s3.size = 40;
			
			Shirt[] shirts = {s1,s2,s3};
			int min = s1.price;
			for(int i=0;i<shirts.length;i++) {
				if(shirts[i].price <min) {
					min = shirts[i].price;
				}
			}
			
			if(min>2000) {
				throw new PriceException("It is costly");
			}
			else {
				System.out.println("Affordable Price");
			}

		
		

	}

}
