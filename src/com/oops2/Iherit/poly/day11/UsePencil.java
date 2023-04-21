package com.oops2.Iherit.poly.day11;

public class UsePencil {

	public static void main(String[] args) {
		
		Pencil p = new Pencil();
		p.brand="cello";
		p.color="black";
		p.isExtraDark=true;
		p.isWood=true;
		p.leadSize=0.5f;
		System.out.println(p.findQuality(35));
		System.out.println(p.brand+" "+p.color+" "+p.isWood+" "+p.leadSize);

	}

}
