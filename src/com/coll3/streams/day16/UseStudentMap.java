package com.coll3.streams.day16;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class UseStudentMap {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, Student> students = new LinkedHashMap<>();
		
		Student s1 = new Student(47, "Dhinesh", 15, "Male", 10, 'A');
		Student s2 = new Student(48, "Vivek", 15, "Male", 9, 'B');
		Student s3 = new Student(34, "Sajin", 14, "Male", 9, 'C');
		Student s4 = new Student(53, "Divya", 12, "Female", 7, 'A');
		Student s5 = new Student(60, "Priya", 13, "Female", 8, 'B');
		Student s6 = new Student(24, "Arun", 14, "Male", 10, 'A');
		Student s7 = new Student(27, "Abinesh", 14, "Male", 8, 'C');
		Student s8 = new Student(17, "Lokesh", 13, "Male", 9, 'A');
		Student s9 = new Student(38, "Mani", 12, "Male", 8, 'A');
		
		students.put(s1.getId(), s1);
		students.put(s2.getId(), s2);
		students.put(s3.getId(), s3);
		students.put(s4.getId(), s4);
		students.put(s5.getId(), s5);
		students.put(s6.getId(), s6);
		students.put(s7.getId(), s7);
		students.put(s8.getId(), s8);
		students.put(s9.getId(), s9);
		
		List<String> collect = students.values().stream().map(x->x.getName()).collect(Collectors.toList());
		for (String x : collect) {
			System.out.println(x);
		}
		
		
		
		
	}

}
