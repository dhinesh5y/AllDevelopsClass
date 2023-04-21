package com.oops2.Iherit.poly.day11;

public class UseAdder {

	public static void main(String[] args) {
		
		Adder a = new Adder();
		
		System.out.println(a.addThis(5, 10, 15));
		System.out.println(a.addThis('d', 'v'));
		System.out.println(a.addThis(2.5f, 5.3f));
		System.out.println(a.addThis(10000000, 9999999));
		
	}

}
