package com.testday3;

public class UseHospital {

	public static void main(String[] args) {

		Hospital h = new Hospital();

		h.name = "APOLD LFLW ";
		h.location = "CHENNAI";

		System.out.println(h.name == h.location);

		System.out.println(h.name.startsWith("A"));
		System.out.println(h.name.endsWith("O"));

		System.out.println(h.name.lastIndexOf("L", 8));
		System.out.println(h.name.indexOf("L")+"\n");
		
		System.out.println(h.name.charAt(5));
		
		String s = "Java, PYTHON , CH+   ";
		System.out.println(s.trim().length()-5);
		
		System.out.println(h.name.charAt(6));
		
	}

}
