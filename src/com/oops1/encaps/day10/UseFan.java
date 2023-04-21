package com.oops1.encaps.day10;

public class UseFan {

	public static void main(String[] args) {
		
		Coil c = new Coil(250, 3000);
		Fan f = new Fan("Cromp", 1500, true, c);
		
		System.out.println(f);
	}
}

class Fan {
	private String brand;
	private int price;
	private boolean isFourWings;
	private Coil coil;
	
	public Fan (String a, int b, boolean c, Coil d) {
		brand=a;
		price=b;
		isFourWings=c;
		coil=d;
	}
	public String toString(){
		return brand+" "+price+" "+isFourWings+"\n"+coil;
	}
}

class Coil {
	 private int capacity;
	 private int price;
	 
	 public Coil(int a, int b){
		 capacity=a;
		 price=b;
	 }
	 
	 public String toString(){
		 return "capacity= "+capacity+" price= "+price;
	 }
}
