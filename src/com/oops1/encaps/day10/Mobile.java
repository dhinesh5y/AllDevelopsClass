package com.oops1.encaps.day10;

public class Mobile {
	
	private String brand;
	private boolean isTypeC;
	private int price;
	private Battery battery;
	
	public void setBrand(String brand){
		this.brand=brand;
	}
	public String getBrand(){
		return brand;
	}
	public void setIsTypeC(boolean isTypeC){
		this.isTypeC=isTypeC;
	}
	public boolean getIsTypeC(){
		return isTypeC;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public int getPrice(){
		return price;
	}
	public void setBattery(Battery battery){
		this.battery=battery;
	}
	public Battery getBattery(){
		return battery;
	}

}
