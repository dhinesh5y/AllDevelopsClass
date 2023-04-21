package com.oops2.Iherit.poly.day11;

public class ElectricalEngineer extends Engineer {
	
	String name;
	boolean isEEE;
	
	public int findSalary(int amt){
		if(isEEE==true){
			return amt*2;
		}else{
		return amt;
		}
	}
	
}
