package com.practice;

public class Employee {

	private String brand;
	private int price;
	private String color;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Employee(String brand, String color){
		this.brand=brand;
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	public String getFd(){
		return brand;
	}
	
}
