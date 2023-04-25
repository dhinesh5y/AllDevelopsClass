package com.java8.day19;

public class UseMetods {

	public static void main(String[] args) {
		
		FindNumbMax a = Methods :: findMax;
		int[]num = {55,48,89,85};
		a.maxNum(num);
		
		MinLen b = Methods :: findMinStringLen;
		String[]str = {"Dhinesh","vivek","saj"};
		b.minLen(str);
		
	}

}
