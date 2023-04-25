package com.java8.day19;

import java.util.Optional;

public class OptionalProgram {

	public static void main(String[] args) {
		
		String name = "";
//		System.out.println(name.length());
//		Optional<String> z = Optional.of(name);
		Optional<String> z = Optional.ofNullable(name);
		
		if(z.isPresent() ){
			System.out.println(name.toUpperCase());
		}
		else{
			System.out.println("Value not present");
		}
		System.out.println(z.orElse("Value Not Present"));
		System.out.println(z.isPresent());

	}

}
