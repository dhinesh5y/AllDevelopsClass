package com.coll1.list.day14;

import java.util.ArrayList;

public class Demo {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		nums.add(4);
		nums.add(5);
		nums.add(7);
		nums.add(8);
		nums.add(9);
		
		nums.set(2, 6);
		nums.add(3, 7);
			
//		System.out.println(nums.get(5));
//		System.out.println(nums);
//		System.out.println("Size - "+nums.size());
//		
//		nums.remove(4);
//		System.out.println(nums);
//		
//		for (Integer x : nums) {
//			System.out.println(x);
//		}
//		System.out.println(" ");
//		for (int i = 0; i < nums.size(); i++) {
//			System.out.println(nums.get(i));
//		}
//		System.out.println(" ");
//		nums.forEach(y->System.out.println(y));
		
		nums.forEach(x->{
			if(x%2==0){
				System.out.println(x+"\n");
			}
		});
		
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i)%2!=0) {
				System.out.println(nums.get(i));
			}
		}
		
		
		
	}
}
