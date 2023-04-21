package com.oops2.Iherit.poly.day11;

public class MountianBike extends Bike {
	
	private String color;
	private int weight;
	
	public MountianBike(String brand, int price, boolean isPetrol, String color, int weight){
		super(brand, price,isPetrol);
		this.color=color;
		this.weight=weight;
	}
	
	public String toString(){
		return super.toString()+" "+color+" "+weight;
	}

}
