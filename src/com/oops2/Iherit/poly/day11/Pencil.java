package com.oops2.Iherit.poly.day11;

public class Pencil extends StationaryProduct {
	boolean  isWood;
	float leadSize;
	boolean isExtraDark;
	
	public String findQuality(int price){
		if(price>30){
		return "Good";
		}else{
			return"bad";
		}
		
	}
}
