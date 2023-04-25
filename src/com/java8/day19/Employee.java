package com.java8.day19;

public interface Employee {

	public int findId(int a);

	public String findName(String a);

	public static String findSalaryRage(int a) {
		if (a > 40000) {
			return a + " High Salary";
		} else {
			return a+ " Low Salary";
		}
	}

}
