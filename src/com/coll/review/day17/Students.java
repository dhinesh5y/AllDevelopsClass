package com.coll.review.day17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Students {
	
	public static void main(String[] args) {
		
		List<Integer> lists = new ArrayList<>();
		lists.add(12);
		lists.add(3);
		lists.add(5);
		lists.add(3, 12);
		System.out.println(lists);
		
		TreeSet<String> li2 = new TreeSet<>();
		li2.add("8");
		li2.add("12");
		li2.add("3");
		li2.add("2");
		li2.add("12");
		
		System.out.println(li2);
		
	}

}
