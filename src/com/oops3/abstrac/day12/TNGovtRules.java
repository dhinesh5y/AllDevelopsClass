package com.oops3.abstrac.day12;

public class TNGovtRules extends CentralGovtRules {

	
	public void noPlateColor(String type) {
			
		if(type.equalsIgnoreCase("private")){
			System.out.println("White with black");
		}else if (type.equalsIgnoreCase("public")) {
			System.out.println("Yellow with black");
		}else if (type.equalsIgnoreCase("electric")) {
			System.out.println("Green with white");
		}
	}
	
	public void staeCode(int code) {
		System.out.println(code);
	}
	
	

}
