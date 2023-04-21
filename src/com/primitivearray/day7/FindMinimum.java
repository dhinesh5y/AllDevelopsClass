package com.primitivearray.day7;

public class FindMinimum {

	public static void main(String[] args) {

		int[] nums = { 26, 10, 26, 7, 3 };

		int temp = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > temp) {
				temp = nums[i];
			}
		}
		System.out.println(temp);

		
	}

}
