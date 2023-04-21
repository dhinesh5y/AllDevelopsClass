package com.primitivearray.day7;

public class FixedArray {

	public static void main(String[] args) {
		
		int [] nums = new int [4];
		nums[0]=1130;
		nums[1]=1131;
		nums[2]=1128;
		nums[3]=1127;
		
		for(int i=0; i<nums.length; i++){
			System.out.println(nums[i]);
		}
		System.out.println();
		
		for(int i=nums.length-1; i>=0; i--){
			System.out.println(nums[i]);
		}
		System.out.println();
		
		for(int i=0; i<nums.length; i++){
			if(nums[i]%2!=0){
				System.out.println(nums[i]);
			}
			
		}

	}

}
