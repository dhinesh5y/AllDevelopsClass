package com.practice;

import java.util.ArrayList;

import javax.swing.text.GapContent;

public class Employees {
	
	public static void main(String[] args) {
		
		String s1 = "Lg,190,Blue";
		String s2 = "Ms,230,Red";
		String s3 = "Ed,170,Green";
		
		String[] a = s1.split(",");
		String[] b = s2.split(",");
		String[] c = s3.split(",");
		
		Employee emp1 = new Employee(a[0], a[2]);
		emp1.setPrice(Integer.parseInt(a[1]));

		Employee emp2 = new Employee(b[0], b[2]);
		emp1.setPrice(Integer.parseInt(a[1]));
		
		Employee emp3 = new Employee(c[0], c[2]);
		emp1.setPrice(Integer.parseInt(a[1]));
		
		ArrayList<Employee> emps = new ArrayList<>();
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		
		int max = 0;
		String v = null;

		for (Employee x : emps) {
			if(x.getPrice()>max){
				max=x.getPrice();
				v=x.getFd();
//				System.out.println(x.getFd()+" is "+max);
			}
		}
			System.out.println(v+" is "+max);
//		}
	}

}
