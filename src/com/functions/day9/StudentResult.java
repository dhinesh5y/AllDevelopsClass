package com.functions.day9;

public class StudentResult {
	
	String average (int a, int b, int c, int d, int e) {
		int avg =  (a+b+c+d+e)/5;
		return "Average "+avg;
	}
	
	void total (int a, int b, int c, int d, int e){
		System.out.println(a+b+c+d+e);
	}

	public static void main(String[] args) {
		StudentResult s = new StudentResult();
		System.out.println(s.average(75, 60, 80, 50, 65));
		s.total(5, 60, 80, 50, 65);
	}

}
