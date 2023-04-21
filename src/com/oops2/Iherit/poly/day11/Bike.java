package com.oops2.Iherit.poly.day11;

public class Bike {
	
	private String  brand;
	private int price;
	private boolean isPetrol;
	
	public Bike(String brand, int price, boolean isPetrol){
		this.brand=brand;
		this.price=price;
		this.isPetrol=isPetrol;
	}
	
	public String toString(){
		return brand+" "+price+" "+isPetrol;
	}

}
