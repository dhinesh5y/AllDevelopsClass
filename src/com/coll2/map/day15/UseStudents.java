package com.coll2.map.day15;

import java.util.HashMap;

public class UseStudents {

	public static void main(String[] args) {
		
		Student s1 = new Student(1130, "Dhine", 10, 'C', 75);
		Student s2 = new Student(1131, "VivekBabu", 11, 'A', 98);
		Student s3 = new Student(1128, "SajinRaj", 10, 'B', 75);
		Student s4 = new Student(1124, "Stnmr", 12, 'C', 89);
		Student s5 = new Student(1145, "Trtsy", 11, 'D', 45);
		Student s6 = new Student(1137, "Wlgtl", 10, 'A', 56);
		
		HashMap<Integer, Student> stds = new HashMap<>();
		stds.put(s1.getId(), s1);
		stds.put(s2.getId(), s2);
		stds.put(s3.getId(), s3);
		stds.put(s4.getId(), s4);
		stds.put(s5.getId(), s5);
		stds.put(s6.getId(), s6);
		
		stds.forEach((x,y)->{
			System.out.println(x+" "+y);
		});
		
		for (Integer x : stds.keySet()) {
			if(stds.get(x).getName().startsWith("S")){
				System.out.println(stds.get(x).getName());
			}
		}
		
		int min =s1.getId();
		String nam = null;
		for (Integer x : stds.keySet()) {
			if(x<min){
				min=x;
				nam=stds.get(x).getName();
			}
		}System.out.println(min +" "+nam);
		int max = s1.getAverage();
		char gr = ' '; // char default value is zero
		for (Student x : stds.values()) {
			if(x.getAverage()>max){
				max=x.getAverage();
				gr=x.getGrade();
			}
		}System.out.println(max+" "+gr);
		
		stds.values().forEach(y->{
			if(y.getStd()==10){
				System.out.println(y);
			}
		});
		
		HashMap<Integer,Student> let = new HashMap<>();
		stds.forEach((x,y)->{
			if(y.getName().length()>5){
				System.out.println(y.getName());
				let.put(x, y);
			}
		});
		System.out.println(let);
		
	}

}
