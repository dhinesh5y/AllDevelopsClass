package com.java8.day19;

import java.util.ArrayList;


public class UseStudent {

	public static void main(String[] args) {
		
		Students s1 = new Students(125, "Dhinesh", 32, "Male", "B.tech");
		Students s2 = new Students(135, "Vivek", 32, "Male", "B.tech");
		Students s3 = new Students(145, "Sajin", 25, "Male", "BE");
		Students s4 = new Students(178, "Sumathi", 34, "Female", "BE");
		Students s5 = new Students(115, "Kanmani", 29, "Female", "BE");
		
		ArrayList<Students> details = new ArrayList<>();
		details.add(s1);
		details.add(s2);
		details.add(s3);
		details.add(s4);
		details.add(s5);
		
		ArrayList<Students> details1 = new ArrayList<>();
		
		
		School s = x->{
			for (Students y :x) {
				if(y.getAge()>30){
				details1.add(y);
				System.out.println(y);
				
				}
			}return null;
		};
		
		s.findAge(details);
		
//		System.out.println(details1);
	}

}
