package com.exception.day18;

public class AgeCheck {

	public static void main(String[] args) throws AgeException {
		System.out.println("Start");
		try{
		int age = 10;
		if (age<18) {
			throw new AgeException("Not Eligible");
		} else {
			System.out.println("Eligible");
		}
		}
		catch(AgeException e){
			e.printStackTrace();
		}
		finally {
			System.out.println("Welcome");
		}
		System.out.println("Complete");
	}

}
