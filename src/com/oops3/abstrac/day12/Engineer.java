package com.oops3.abstrac.day12;

public abstract class Engineer implements Human {
	
	public String eat (String food){
		return food;
	}
	public int sleep (int hour){
		return hour;
	}
	public abstract String workforLiving(String job);
	public abstract String showSalary(int exp);
}
