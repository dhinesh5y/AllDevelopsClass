package com.functions.day9;

public class Mobile implements  Electronics {

	public int reSale(int a) {
		return a/2;
	}
	public  String onOff(boolean isOn){
		if(isOn==true){
			return "Mobile is working";
		}
		else{
			return "Mobile not working";
		}
	}
}
