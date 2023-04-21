package com.oops1.encaps.day10;

public class Battery {
	
	private boolean isLithium;
	private int capacity;
	
	public void setIsLithium(boolean isLithium){
		this.isLithium=isLithium;
	}
	public boolean getIsLithium(){
		return isLithium;
	}
	public void setCapacity(int capacity){
		this.capacity=capacity;
	}
	public int getCapacity(){
		return capacity;
	}

}
