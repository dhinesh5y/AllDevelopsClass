package com.oops1.encaps.day10;

public class UseCar {

	public static void main(String[] args) {
		
		Engine e = new Engine();
		e.capacity= 2500;
		e.isPetrol= true;
		
		Car c = new Car();
		c.barnd="Ford";
		c.model="Figo";
		c.price=500000;
		c.engine=e;
		System.out.println(c.barnd+" "+c.engine.capacity+" "+c.engine.isPetrol);
				

	}

}
