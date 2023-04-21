package com.oops2.Iherit.poly.day11;

public class SoftwareEngineer extends Engineer {
	
	String name;
	boolean isIT;
	
	public int findSalary(int amt){
		if(isIT==true){
			return amt*3;
		}else{
			return amt;
		}
	}

}
