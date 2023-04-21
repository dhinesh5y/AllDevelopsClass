package com.conditions.day5;

public class CheckGrade {

	public static void main(String[] args) {
		
		int grade =  -5;
		
		if (grade>=0&&grade<=40) {
			System.out.println(grade+" is 'C' grade");
			
		} else if (grade>40&&grade<=60) {
			System.out.println(grade+" is 'B' grade");
		}else if (grade>60&&grade<=80) {
			System.out.println(grade+" is 'A' grade");
		}else if (grade>80&&grade<=100) {
			System.out.println(grade+" is 'O' grade");
		}else {
			System.out.println("Abscent");
		}
		

	}

}
