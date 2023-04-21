package com.coll2.map.day15;

public class CustomerDetails {
	
	private String name;
	private int age;
	private int amtAvailable;
	private long aadhaarNo;
	private String gender;
	
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
	public int getAmtAvailable() {
		return amtAvailable;
	}
	public void setAmtAvailable(int amtAvailable) {
		this.amtAvailable = amtAvailable;
	}
	public long getAadhaarNo() {
		return aadhaarNo;
	}
	public void setAadhaarNo(long aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public CustomerDetails(String name, int age, int amtAvailable, long aadhaarNo, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.amtAvailable = amtAvailable;
		this.aadhaarNo = aadhaarNo;
		this.gender = gender;
	}
	
	public String toString() {
		return "CustomerDetails [name=" + name + ", age=" + age + ", amtAvailable=" + amtAvailable + ", aadhaarNo="
				+ aadhaarNo + ", gender=" + gender + "]";
	}
	
	


}
