package com.practice;

public class StringLms {

	public static void main(String[] args) {
		
		String s = "CRTett@Read@UPDATE@Delete@DHTDRGFGG@dgghdsgdseR";
		
		String[] a = s.split("@");
		
		int count =0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 2; j < a[i].length(); j++) {
				if(a[i].charAt(j)>='a'&&a[i].charAt(j)<='z'){
					System.out.println(a[i]);
					count=count+1;
					break;
				} 
				
				
			}
		}
		System.out.println(count);
	}

}
