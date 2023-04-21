package com.oops.review.day13;

import java.util.Arrays;

public class Car {
	
	private String brand;
	private int price;
	private String model;
	private String color;
	private Engine engine;
	private Tyre[] tyers;

//	public String toString() {
//		return "Car [brand=" + brand + ", price=" + price + ", model=" + model + ", color=" + color + ", engine="
//				+ engine + ", tyers=" + Arrays.toString(tyers) + "]";
//	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Tyre[] getTyers() {
		return tyers;
	}
	public void setTyers(Tyre[] tyers) {
		this.tyers = tyers;
	}
	
	public Car (String brand, int price, String model, String color, Engine engine, Tyre[] tyers){
		this.brand=brand;
		this.price=price;
		this.model=model;
		this.color=color;
	    this.engine=engine;
		this.tyers=tyers;
	}
	
	
	

}
