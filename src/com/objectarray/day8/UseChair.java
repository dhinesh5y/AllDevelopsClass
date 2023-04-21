package com.objectarray.day8;

public class UseChair {

	public static void main(String[] args) {
		
		Chair c1 = new Chair();
		c1.woodType="teak";
		c1.price=2500;
		c1.colour="brown";
		
		Chair c2 = new Chair();
		c2.woodType="greak";
		c2.price=2100;
		c2.colour="yellow";
		
		Chair c3 = new Chair();
		c3.woodType="plastic";
		c3.price=750;
		c3.colour="red";
		
		Chair c4 = new Chair();
		c4.woodType="steel";
		c4.price=1500;
		c4.colour="blue";
		
		Chair c5 = new Chair();
		c5.woodType="iron";
		c5.price=1800;
		c5.colour="grey";
		
		Chair[] chairs = {c1, c2, c3, c4, c5};
		
		for (Chair ch : chairs) {
			if (ch.colour.contains("a")||ch.colour.contains("e")||ch.colour.contains("i")||ch.colour.contains("o")||ch.colour.contains("u")) {
				System.out.println(ch.price +" "+ ch.woodType);
			}
		}
		

	}

}
