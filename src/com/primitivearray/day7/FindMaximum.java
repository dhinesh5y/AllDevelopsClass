package com.primitivearray.day7;

public class FindMaximum {

	public static void main(String[] args) {

		int[] nums = { 6, 10, 26, 7, 3 };

		int temp = nums[0];

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= temp) {
				temp = nums[i];
			}
		}
		System.out.println(temp);



	}

}
