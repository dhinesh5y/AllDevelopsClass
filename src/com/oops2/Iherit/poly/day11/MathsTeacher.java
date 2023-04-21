package com.oops2.Iherit.poly.day11;

public class MathsTeacher {

	public static void main(String[] args) {
		
		Teacher t = new Teacher();
		t.name="kalmala";
		t.id=3488;
		t.isMale=false;
		t.isPrivateTeacher=true;
		t.salaryPerDay=800;
		System.out.println(t.findMothlySalary(t.salaryPerDay));
		System.out.println(t.name+" "+t.id+" "+t.salaryPerDay);

	}

}
