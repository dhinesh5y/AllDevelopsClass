package com.ms.day1.day20;

import java.util.ArrayList;
import java.util.List;

public class ArrayListNums {

	int a;
	public List<Integer> Nums(int a) {
		
		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < a; i++) {
			nums.add(i);
		}

		return nums;
	}

}
