package com.oops1.encaps.day10;

public class UseLaptop {

	public static void main(String[] args) {
		
		Display d = new Display("LED",5);
		Laptop l = new Laptop("HP",32000, true, d);
		l.setDisplay(d);
		
//		l.setIsWarranty(true);
		
		l.setYear(2022);
		
		System.out.println(l);
//		System.out.println(l.get);
		System.out.println(l.getIsWarranty()+" "+l.getDisplay());
	}
}

class Laptop{
	private String brand;
	private int price;
	private boolean isWarranty;
	private int year;
	private Display display;
	
	public Laptop(String a, int b, boolean d, Display c) {
		brand=a;
		price=b;
		isWarranty=d;
		display=c;
	}
	public String toString(){
		return brand+" "+price+" "+isWarranty+" "+year+" "+display;
	}
//	public void setIsWarranty(boolean isWarranty){
//		this.isWarranty=isWarranty;
//	}
	public void setYear(int year){
		this.year=year;
	}
	public boolean getIsWarranty(){
		return isWarranty;
	}
	public int getYear(){
		return year;
	}
	public void setDisplay(Display display) {
		this.display = display;
	}
	public Display getDisplay() {
		return display;
	}
	

}

class Display{
	
	private String type;
	private int size;
	
	public Display(String a, int b){
		type=a;
		size=b;
	}
	public String toString(){
		return type+" "+size+"\n";
	}
	
	
	
}
