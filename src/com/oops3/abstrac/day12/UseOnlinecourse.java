package com.oops3.abstrac.day12;

public class UseOnlinecourse {

	public static void main(String[] args) {
		
		OnlineCourse c = new OnlineCourse();
		System.out.println(c.courseId(1245));
		System.out.println(c.courseIs30Days(true));
		System.out.println(c.courseTrainerName("Nishanthi"));
		System.out.println(c.courseURL("website"));
		System.out.println(c.courseNameWithFees("java"));

	}

}
