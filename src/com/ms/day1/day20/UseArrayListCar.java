package com.ms.day1.day20;

import java.util.ArrayList;

import com.coll1.list.day14.Car;

public class UseArrayListCar {

	public static void main(String[] args) {
		ArrayListCar ar = new ArrayListCar();
		
		ArrayList<Car> cars = new ArrayList<>();
		cars.add(new Car("Ford", 1250000, "Figo"));
		cars.add(new Car("Audi", 2500000, "A5"));
		cars.add(new Car ("Benz", 3500000, "Class"));
		
		System.out.println(ar.findColor("Fo", cars));
	}

}
