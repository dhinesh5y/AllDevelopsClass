package com.coll1.list.day14;

public class Students {
	
	int id;
	String name;
	int age;
	String gender;
	String degree;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Students(int id, String name, int age, String gender, String degree) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.degree = degree;
	}
	
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", degree=" + degree
				+ "]";
	}

}
