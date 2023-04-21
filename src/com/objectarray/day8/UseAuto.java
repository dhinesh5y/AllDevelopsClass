package com.objectarray.day8;

public class UseAuto {

	public static void main(String[] args) {
		
		Integer[] nums ={45, 87, 24, 78, 69};
		int min = nums[0];
		for (Integer integer : nums) {
			if (integer<min) {
				min=integer;	
			}
		}
		System.out.println(min);
	}

}
