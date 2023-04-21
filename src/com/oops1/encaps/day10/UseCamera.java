package com.oops1.encaps.day10;

public class UseCamera {

	public static void main(String[] args) {
		
		Lens l = new Lens();
		l.setType("Sperical");
		l.setLength(12);
		
		Camera c = new Camera();
		c.setBrand("Nikon");
		c.setPrice(8000);
		c.setWarranty(true);
		c.setLens(l);
		
		System.out.println(c);
		
	}

}

class Camera {
	private String brand;
	private int price;
	private boolean isWarranty;
	private Lens lens;
	
	public void setBrand (String brand){
		this.brand=brand;
	}
	public void setPrice (int price){
		this.price=price;
	}
	public void setWarranty (boolean isWarranty){
		this.isWarranty=isWarranty;
	}
	public void setLens (Lens lens){
		this.lens=lens;
	}
	
	
	public String toString(){
		return brand+" "+price+""+isWarranty+"\n"+lens;
	}
	
	
}

class Lens {
	private String type;
	private int length;
	
	public void setType (String type){
		this.type=type;
	}
	public void setLength (int length){
		this.length=length;
	}
	
	public String toString(){
		return type+" "+length;
	}
	
}
