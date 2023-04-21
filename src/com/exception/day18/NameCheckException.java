package com.exception.day18;

public class NameCheckException {

	public static void main(String[] args)  {
		System.out.println("Start");
		try{
		String name1 = "Dhinesh";
		String name2 = "Vivek";
		
		if(name1.equals(name2)){
			System.out.println("Satisfied");
		}
		else{
			throw new NameException("Not Satisfied");
		}
		}
		catch(NameException e){
			e.printStackTrace();
		}
		finally{
			System.out.println("Welcome");
		}
		System.out.println("Complete");
		
	}

}
