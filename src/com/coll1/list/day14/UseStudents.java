package com.coll1.list.day14;

import java.util.ArrayList;

public class UseStudents {

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
		
		for (Students students : details) {
			System.out.println(students);
		}
		System.out.println(" ");
		
		details.forEach(x->{
			if(x.getAge()<30){
				System.out.println(x);
			}
		});
		System.out.println(" ");
		for (int i = 0; i < details.size(); i++) {
			if(details.get(i).gender.equalsIgnoreCase("Female")){
				System.out.println(details.get(i));
			}
		}
		
		ArrayList<Students> maleList = new ArrayList<>();
		ArrayList<Students> femaleList = new ArrayList<>();
		for (int i = 0; i < details.size(); i++) {
			if(details.get(i).getGender().equalsIgnoreCase("Female")){
				maleList.add(details.get(i));
			}
			else{
				femaleList.add(details.get(i));
		}
		}
		
		System.out.println(" ");
		System.out.println(maleList);
		System.out.println(femaleList);
		
		ArrayList<String> names = new ArrayList<>();
		System.out.println(" ");
		for (Students x : details) {
			names.add(x.getName());
		}
		System.out.println(names);
	}

}
