package com.coll3.streams.day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseStudent {
	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(47, "Dhinesh", 15, "Male", 10, 'A'));
		students.add(new Student(48, "Vivek", 15, "Male", 9, 'B'));
		students.add(new Student(34, "Dhinesh", 14, "Male", 9, 'C'));
		students.add(new Student(53, "Divya", 12, "Female", 7, 'A'));
		students.add(new Student(60, "Priya", 13, "Female", 8, 'B'));
		students.add(new Student(24, "Arun", 14, "Male", 10, 'A'));
		students.add(new Student(27, "Abinesh", 14, "Male", 8, 'C'));
		students.add(new Student(17, "Idress", 13, "Male", 9, 'A'));
		students.add(new Student(38, "Mani", 12, "Male", 8, 'A'));

		List<String> nameList8th = students.stream().filter(x -> x.getStd() == 8).map(y -> y.getName())
				.collect(Collectors.toList());
		for (String x : nameList8th) {
			System.out.println(x);
		}
		System.out.println();
		List<Student> secAList = students.stream().filter(x -> x.getSection() == 'A').collect(Collectors.toList());
		long countA = secAList.stream().count();
		System.out.println(countA);
		for (Student x : secAList) {
			System.out.println(x);
		}
		System.out.println();
		List<Student> secBList = students.stream().filter(x -> x.getSection() == 'B').collect(Collectors.toList());
		long countB = secBList.stream().count();
		System.out.println(countB);
		for (Student x : secBList) {
			System.out.println(x);
		}
		System.out.println();
		List<Student> secCList = students.stream().filter(x -> x.getSection() == 'C').collect(Collectors.toList());
		long countC = secCList.stream().count();
		System.out.println(countC);
		for (Student x : secCList) {
			System.out.println(x);
		}
		System.out.println();
		List<Integer> maleIds = students.stream().filter(x -> x.getGender().equals("Male")).map(y -> y.getId())
				.collect(Collectors.toList());
		for (Integer x : maleIds) {
			System.out.println(x);
		}
		System.out.println();
		List<String> ageStd = students.stream().filter(x -> x.getAge() == 15).map(y -> y.getName())
				.collect(Collectors.toList());
		for (String x : ageStd) {
			System.out.println(x);
		}
		Map<Integer, Student> st = students.stream().filter(x -> x.getAge() == 15)
				.collect(Collectors.toMap(e -> e.getId(), f -> f));
		for (Student stg : st.values()) {
			System.out.println(stg);
		}
		System.out.println(st);

		Student maxAge = students.stream().max(Comparator.comparing(Student::getAge)).get();
		System.out.println(maxAge);

		Student minAge = students.stream().min(Comparator.comparing(Student::getAge)).get();
		System.out.println(minAge);

		List<Student> collect = students.stream().limit(5).collect(Collectors.toList());
		System.out.println(collect);

		List<Student> collect2 = students.stream().sorted(Comparator.comparing(Student::getAge))
				.filter(x -> x.getAge() < 15).collect(Collectors.toList());
		System.out.println(collect2);

		List<Student> collect3 = students.stream().sorted(Comparator.comparing(Student::getAge))
				.collect(Collectors.toList());
		System.out.println(collect3);

		Long collect4 = students.stream().collect(Collectors.summingLong(z -> z.getAge()));
		System.out.println(collect4);

		List<Student> collect5 = students.stream().sorted(Comparator.comparing(Student::getName).reversed())
				.collect(Collectors.toList());
		for (Student student : collect5) {
			System.out.println(student);
		}

		List<Integer> collect6 = students.stream().map(x -> x.getAge()).distinct().collect(Collectors.toList());
		System.out.println(collect6);
		
		List<Character> collect7 = students.stream().map(y->y.getName().charAt(1)).collect(Collectors.toList());
		for (Character ch : collect7) {
			System.out.println(ch);
			
		}
		List<Student> collect8 = students.stream().filter(x->!x.getName().equals("Vivek")).collect(Collectors.toList());
		System.out.println(collect8);
		System.out.println();
		
		List<String> li = new ArrayList<>();
		for (Student x : students) {
			if(x.getGender().equals("Female")){
				li.add(x.getGender().toUpperCase());
			}
		}
		System.out.println(li);
		
		List<Student> li1 = new ArrayList<>();
		for (Student x : students) {
			x.setAge(x.getAge()+2);
			li1.add(x);
		}
		System.out.println(li1);
		
		List<Student> li3 = new ArrayList<>();
		for (Student x : students) {
			if(x.getGender().equals("Female")){
				x.setGender(x.getGender().toUpperCase());
				li3.add(x);
			}
		}
		System.out.println(li3);
		
	}
	

}
