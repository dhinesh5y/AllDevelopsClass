package com.functions.day9;

public interface Electronics {
	
	public int reSale(int a);
	
	public default String onOff(boolean isOn){
		if(isOn==true){
			return "Product is working";
		}
		else{
			return "Not working";
		}
		
	}
	
}
