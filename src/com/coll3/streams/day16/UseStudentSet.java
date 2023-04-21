package com.coll3.streams.day16;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class UseStudentSet {

	public static void main(String[] args) {
		
		HashSet<Student> students = new HashSet<>();
		students.add(new Student(47, "Dhinesh", 15, "Male", 10, 'A'));
		students.add(new Student(48, "Vivek", 15, "Male", 9, 'B'));
		students.add(new Student(34, "Sajin", 14, "Male", 9, 'C'));
		students.add(new Student(53, "Divya", 12, "Female", 7, 'A'));
		students.add(new Student(60, "Priya", 13, "Female", 8, 'B'));
		students.add(new Student(24, "Arun", 14, "Male", 10, 'A'));
		students.add(new Student(27, "Dhinesh", 14, "Male", 8, 'C'));
		students.add(new Student(17, "Lokesh", 13, "Male", 9, 'A'));
		students.add(new Student(38, "Mani", 12, "Male", 8, 'A'));
		
		List<String> collect = students.stream().map(x->x.getName()).collect(Collectors.toList());
		for (String x : collect) {
			System.out.println(x);
		}
//		students.stream().filter(x->x.getGender().equalsIgnoreCase("female")).collect(Collectors.toMap())
		
		
	}

}
