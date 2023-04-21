package com.oops3.abstrac.day12;

public class SoftwareEngineer extends Engineer {
	
	
	public String workforLiving(String job){
		return job;
	}
	public String showSalary(int exp){
		
		if(exp<=2){
			return "350000 per annum";
		}
		else if(exp>=3&&exp<=5){
			return "620000 per annum";
		}else if(exp>=6&&exp<=10){
			return "850000 per annum";
		}else {
			return "invalid";
		}
		
	
	}
	
	public int walk(int speed) {
		
		return speed;
	}

}
