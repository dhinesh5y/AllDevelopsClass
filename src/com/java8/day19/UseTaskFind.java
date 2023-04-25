package com.java8.day19;

import java.util.ArrayList;

public class UseTaskFind {

	public static void main(String[] args) {
		
		TaskFind z = x->{
			for(Integer y : x){
			if(y%2==0){
				System.out.println(y);
			}}
		};
		
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(25);
		nums.add(89);
		nums.add(14);
		nums.add(73);
		nums.add(45);
		nums.add(22);
		
		z.findEven(nums);
		}

}
