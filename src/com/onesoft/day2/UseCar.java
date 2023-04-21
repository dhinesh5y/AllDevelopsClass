package com.onesoft.day2;

public class UseCar {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.brand="Ford Ecosport";
		c.colour="Diamond White";
		c.price=1250000;
		c.taxAmount=100000;
		c.netPrice=c.price+c.taxAmount;
		
		System.out.println(c.brand+"\n"+c.colour+"\n"+c.netPrice);
				

	}

}
