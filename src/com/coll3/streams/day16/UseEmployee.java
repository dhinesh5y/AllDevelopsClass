package com.coll3.streams.day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployee {

	public static void main(String[] args) {
		
		ArrayList<Employee> emps = new ArrayList<>();
		 emps.add(new Employee(112, "Dhinesh", 25000, "Male"));
		 emps.add(new Employee(113, "Vivek", 27000, "Male"));
		 emps.add(new Employee(214, "Sajin", 26500, "Male"));
		 emps.add(new Employee(254, "Sundar", 24500, "Male"));
		 emps.add(new Employee(328, "Divya", 24750, "Female"));
		 emps.add(new Employee(347, "Priya", 23000, "Female"));
		 emps.add(new Employee(368, "Siva", 22500, "Male"));
		 emps.add(new Employee(135, "Brun", 23500, "Male"));
		 emps.add(new Employee(269, "Kavya", 22750, "Female"));
		
		List<Employee> female = emps.stream().filter(x->x.getGender().equalsIgnoreCase("female")).collect(Collectors.toList());
		
		for (Employee x : female) {
			System.out.println(x);
		}
		System.out.println();
		List<Employee> salary = emps.stream().filter(x->(x.getSalary()>24000&&x.getSalary()<25500)).collect(Collectors.toList());
		for (Employee x : salary) {
			System.out.println(x);
		}
		long count = emps.stream().count();
		
		System.out.println(count);
		System.out.println();
		List<Integer> maleIds = emps.stream().filter(x->x.getGender().equalsIgnoreCase("Male")).map(y->y.getId()).collect(Collectors.toList());
		for (Integer x : maleIds) {
			System.out.println(x);
		}
		
		List<Employee> collect = emps.stream().limit(1).collect(Collectors.toList());
		System.out.println(collect);
		
		Integer collect2 = emps.stream().collect(Collectors.summingInt(x->x.getId()));
		System.out.println(collect2);
		
		Employee employee = emps.stream().max(Comparator.comparing(Employee::getSalary)).get();
		System.out.println(employee);
		
		Employee employ = emps.stream().min(Comparator.comparing(Employee::getName)).get();
		System.out.println(employ);
		
//		emps.stream().map(x->x.getGender()).distinct().collect(Collectors.toList())
	}

}
