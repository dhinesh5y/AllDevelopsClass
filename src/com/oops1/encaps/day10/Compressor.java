package com.oops1.encaps.day10;

public class Compressor {
	
	private String type;
	private boolean isWarranty;
	private int phase;
	
	public void setType(String a){
		type=a;
	}
	public String getType (){
		return type;
	}
	public void setIsWarranty(boolean a){
		isWarranty=a;
	}
	public boolean getIsWarranty(){
		return isWarranty;
	}
	public void setPhase(int a){
		phase=a;
	}
	public int getPhase (){
		return phase;
	}

}
