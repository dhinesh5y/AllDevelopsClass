package com.java8.day19;

public class UseFindPositiveNumber {

	public static void main(String[] args) {
		
		FindPositiveNumber pos = (x->{
			for(Integer y: x){
				if(y>0){
					System.out.println(y+" Positive Number");
				}
			}
		});
		FindPositiveNumber neg = (x->{
			for(Integer y: x){
				if(y<0){
					System.out.println(y+" Negative Number");
				}
			}
		});
		
		
		
		int[]num = {1,2,-2, 4, -9};
		pos.findPosNum(num);
		neg.findPosNum(num);
	}

}
