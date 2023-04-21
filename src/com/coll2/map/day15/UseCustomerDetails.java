package com.coll2.map.day15;

import java.util.HashMap;
import java.util.Iterator;

public class UseCustomerDetails {

	public static void main(String[] args) {

		CustomerDetails c1 = new CustomerDetails("Dhinesh", 31, 15000, 409058896645l, "Male");
		CustomerDetails c2 = new CustomerDetails("Vivek", 32, 16500, 529058896678l, "Male");
		CustomerDetails c3 = new CustomerDetails("Sajin", 26, 8000, 809058896612l, "Male");
		CustomerDetails c4 = new CustomerDetails("Sundar", 24, 7500, 759058896698l, "Male");
		CustomerDetails c5 = new CustomerDetails("Nithiya", 31, 8300, 379058896662l, "Female");

		HashMap<Long, CustomerDetails> cus = new HashMap<>();
		cus.put(c1.getAadhaarNo(), c1);
		cus.put(c2.getAadhaarNo(), c2);
		cus.put(c3.getAadhaarNo(), c3);
		cus.put(c4.getAadhaarNo(), c4);
		cus.put(c5.getAadhaarNo(), c5);

		Iterator<CustomerDetails> itr = cus.values().iterator();
		while (itr.hasNext()) {
			if (itr.next().getAge() <= 25) {
				itr.remove();
			}
		}
		cus.forEach((x, y) -> {
			System.out.println(x + " " + y);
		});

		System.out.println(" ");

		HashMap<Long, CustomerDetails> cus1 = new HashMap<>();
		for (CustomerDetails x : cus.values()) {
			if (x.getAmtAvailable() > 10000 && x.getAge() > 30) {
				cus1.put(x.getAadhaarNo(), x);
			}
		}

		cus1.forEach((x, y) -> {
			System.out.println(x + " " + y);
		});
		System.out.println();
		
		int min = c1.getAge();
		CustomerDetails cus2 = null;
		for (CustomerDetails x : cus.values()) {
			if(x.getAge()<min){
				min=x.getAge();
				cus2=x;
				
			}
		}
		System.out.println(cus2);
		
		Iterator<CustomerDetails> itr1 = cus.values().iterator();
		while (itr1.hasNext()) {
			if (itr1.next().getGender().equalsIgnoreCase("male")) {
				itr1.remove();
			}
		}
		cus.forEach((x, y) -> {
			System.out.println(x + " " + y);
		});
		
		System.out.println();
		Iterator<Long> itr2 = cus.keySet().iterator();
		while (itr2.hasNext()) {
			if (cus.get(itr2.next()).getAge()<30){
				itr2.remove();
			}
		}
		
		for (Long x : cus.keySet()) {
			System.out.println(x+" "+cus.get(x));
		}
		
	}

}
