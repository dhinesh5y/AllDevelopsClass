package com.onesoft.day3;

public class Arrays {

	public static void main(String[] args) {
		
		int [] num = {10, 20, 30, 40, 50};
		
		System.out.println(num.length);
		System.out.println(num[1]);
		System.out.println(num[4]+"\n");
		
		String [] st = {"Sony", "LG", "Onida",};
		System.out.println(st[0].length());
		System.out.println(st[1].toLowerCase());
		System.out.println(st[2].toUpperCase());
		System.out.println(st[2].substring(2,3));
		
		float [] fl = {105.1f, 263.2f, 305.3f, 585.5f};
		System.out.println(fl[2]);
		System.out.println(fl[0]+fl[1]);
		
		boolean [] isQues = {true, false, true, false};
		System.out.println(isQues[1]);
		
		char [] ch = {'S','D','C','X','R'};
		System.out.println(ch.length);
		
		System.out.println();
		
		
		

	}

}
