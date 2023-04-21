package com.oops2.Iherit.poly.day11;

public class Teacher extends Employee {
	
	boolean isPrivateTeacher;
	int salaryPerDay;
	
	public int findMothlySalary(int salaryPerDay){
		return (salaryPerDay*30);
	}

}
