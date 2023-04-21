package com.oops2.Iherit.poly.day11;

public class FindMax {
	
	public int findMax(){
		return 10;
	}
	
	public int findMax(int a, int b){
		if(a>b){
			return a;			
		}else{
			return b;
		}
	}
	public String findMax(String a, String b){
		if(a.length()>b.length()){
			return a;
		}else{
			return b;
		}
	}

}
