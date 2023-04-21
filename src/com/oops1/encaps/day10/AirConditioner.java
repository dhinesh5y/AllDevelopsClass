package com.oops1.encaps.day10;

public class AirConditioner {
	
	private String brand;
	private int price;
	private boolean isSplit;
	private Compressor compressor;
	
	public void setBrand(String a){
		brand=a;
	}
	public String getBrand (){
		return brand;
	}
	public void setPrice(int a){
		price=a;
	}
	public int getPrice(){
		return price;
	}
	public void setIsSplit(boolean a){
		isSplit=a;
	}
	public boolean getIsSplit (){
		return isSplit;
	}
	public void setCompressor(Compressor a){
		compressor=a;
	}
	public Compressor getCompressor(){
		return compressor;
	}
	
	

}
