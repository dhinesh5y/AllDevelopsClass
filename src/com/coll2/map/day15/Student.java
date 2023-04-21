package com.coll2.map.day15;

public class Student {
	
	private int id;
	private String name;
	private int std;
	private char grade;
	private int average;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public int getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}

	public Student(int id, String name, int std, char grade, int average) {
		super();
		this.id = id;
		this.name = name;
		this.std = std;
		this.grade = grade;
		this.average = average;
	}

	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", std=" + std + ", grade=" + grade + ", average=" + average
				+ "]";
	}
	
	
	

}
