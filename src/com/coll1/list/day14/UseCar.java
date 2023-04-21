package com.coll1.list.day14;

import java.util.ArrayList;

public class UseCar {

	public static void main(String[] args) {
		
		ArrayList<Car> cars = new ArrayList<>();
		cars.add(new Car("Ford", 1250000, "Figo"));
		cars.add(new Car("Audi", 2500000, "A5"));
		cars.add(new Car ("Benz", 3500000, "Class"));
		
		cars.forEach(x->System.out.println(x.getBrand()));
		System.out.println(" ");
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i).getModel());
		}
		System.out.println();
		for (Car car : cars) {
			System.out.println(car.getPrice());
		}
		
	}

}
