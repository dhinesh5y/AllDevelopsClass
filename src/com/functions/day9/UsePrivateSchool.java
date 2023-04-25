package com.functions.day9;

public class UsePrivateSchool {

	public static void main(String[] args) {
		
		PrivateSchool p = new PrivateSchool();
		System.out.println(p.schoolName("THSS"));
		System.out.println(p.studentCount(1600));
		System.out.println(School.isPrivate(true));
	}

}
