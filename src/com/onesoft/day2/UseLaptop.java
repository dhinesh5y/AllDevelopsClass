package com.onesoft.day2;

public class UseLaptop {

	public static void main(String[] args) {
		
		String version = "11th Generation";
		
		Laptop l = new Laptop();
		
		l.brand="Lenovo";
		l.price=39000;
		l.flip='N';
		l.serialNum=475869142536l;
		l.displaySize=15.5f;
		l.isIntelOS=true;
		
		System.out.println(l.brand+" "+l.price+" "+l.flip+"\n"+l.serialNum+"\n"+l.displaySize+" "+l.isIntelOS);
		System.out.println(version);
	}

}
