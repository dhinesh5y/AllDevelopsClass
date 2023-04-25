package com.ms.day1.day20;

import java.util.ArrayList;
import java.util.List;

import com.coll1.list.day14.Car;

public class ArrayListCar {
	
	public List<Car> findColor(String brand, List<Car> cars){
		
		List<Car> color = new ArrayList<>();
		for (Car x : cars) {
			if(x.getBrand().equals("Fo")){
				color.add(x);
			}else{
				System.out.println("Not Valid");
			}
			}
		return color;
		
	}

}
