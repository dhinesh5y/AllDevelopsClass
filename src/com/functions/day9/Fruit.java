package com.functions.day9;

public interface Fruit {
	
	public String color(String a);
	
	public int price(int a);
	
	public default String weight(float a){
		return " "+a;
	}

}
