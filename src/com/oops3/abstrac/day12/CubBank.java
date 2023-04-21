package com.oops3.abstrac.day12;

public class CubBank implements Bank {

	public long accNum(long a) {
		return a;
	}

	public int pinNum(int b) {
		return b;
	}

	public float rateOfIntrest(int amt) {
		return amt * 5 / 100;
	}

}
