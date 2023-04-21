package com.oops1.encaps.day10;

public class UseComputer {

	public static void main(String[] args) {
		
		Cpu c = new Cpu("Intel",7500,16);
		Computer p = new Computer("HP","flip",25000,c);
		
		System.out.println(p.getBrand()+" "+p.getCpu().getBrand());
	}

}

class Computer{
	
	private String brand;
	private String model;
	private int price;
	private Cpu cpu;
	
	public Computer (String a, String b, int c, Cpu d){
		brand=a;
		model=b;
		price=c;
		cpu=d;
	}
	
	public String getBrand(){
		return brand;
	}
	public String getModel(){
		return model;
	}
	public int getPrice(){
		return price;
	}
	public Cpu getCpu(){
		return cpu;
	}
	
}

class Cpu{
	
	private String brand;
	private int price;
	private int ram;
	
	public Cpu (String a, int b, int c){
		brand=a;
		price=b;
		ram=c;
	}
	
	public String getBrand(){
		return brand;
	}
	public int getPrice(){
		return price;
	}
	public int getRam(){
		return ram;
	}
	
}
