package com.oops2.Iherit.poly.day11;

public class UseEngineer {

	public static void main(String[] args) {
		
		SoftwareEngineer s = new SoftwareEngineer();
		s.name="Dhinesh";
		s.isIT=true;
		s.field="Software";
		s.degree="Information Technology";
		s.findSalary(25000);
		
		System.out.println(s.name+" "+s.isIT+" "+s.findSalary(25000));
		System.out.println(s.field);
		
		ElectricalEngineer e = new ElectricalEngineer();
		e.name="Dhinesh";
		e.isEEE=true;
		e.field="Software";
		e.degree="Information Technology";
		e.findSalary(25000);
		
		System.out.println(e.name+" "+e.isEEE+" "+e.findSalary(25000));
		System.out.println(e.field);
		
		
	}

}
