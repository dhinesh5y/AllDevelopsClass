package com.oops3.abstrac.day12;

public abstract class Worker {
	
	String name;
	int id;
	int salaryperhour;
	int workinghour;
	
	public abstract void monthSalary(int salaryperhour, int workinghour);
	
	public void jobName(String name){
		System.out.println(name);
	}
}
