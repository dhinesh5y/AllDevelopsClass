package com.exception.day18;

public class MultiCatchProgram {

	public static void main(String[] args) {
		System.out.println("Start");
		try {
			String [] a = { "Dhin", "Vivek", "Sajin" };
			System.out.println(a[2].charAt(5));
		}
		catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch (RuntimeException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("Welcome");
		}
		System.out.println("Complete");
	}

}
