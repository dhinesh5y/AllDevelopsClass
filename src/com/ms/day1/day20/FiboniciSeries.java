package com.ms.day1.day20;

import java.util.ArrayList;
import java.util.List;

public class FiboniciSeries {
	
	public List<Integer> fibonici(int f){
		
		int a = 0;
		int b = 1;
		int c = 0;
		List<Integer> nums = new ArrayList<>();
		for (int i =0; i<=f; i++){
//			System.out.println(a);
			nums.add(c=a);
			a=b;
			b=a+c;
			
			
		}
		return nums;
	}
	

}
