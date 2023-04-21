package com.exception.day18;

public class ArrayIndexOutOfBoundsExcept {

	public static void main(String[] args) {
		System.out.println("Strat");
		try {
			int[] a = { 1, 2, 3, 4 };
			System.out.println(a[4]);
		}
		catch (Exception e) {
			System.err.println("Array Index Out Of Bounds Occurs");
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("Complete");
	}

}
