package com.functions.day9;

public interface School {
	
	public String schoolName(String a);
	
	public static String isPrivate(boolean a){
		return "its private school";
		
	}
	
	public default String studentCount(int a){
		if(a>1500){
		return "High Range School";
		}
		else{
			return "Low Range School";
		}
	}

}
