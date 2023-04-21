package com.onesoft.day2;

public class UseSaree {

	public static void main(String[] args) {
		
		Saree s = new Saree();
		
		s.brand="Legan";
		s.type="Cotton";
		s.colour="Red";
		s.price=1450f;
		s.discount=25f;
		s.netPrice=(s.price-(s.price*s.discount/100));
		
		System.out.println(s.brand+" "+s.type+" "+s.colour+" "+s.netPrice);
		
	}

}
