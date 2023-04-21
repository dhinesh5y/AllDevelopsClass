package com.oops3.abstrac.day12;

public class UseSmartPhone {

	public static void main(String[] args) {
		SmartPhone s = new SmartPhone();
		System.out.println(s.cameraFunction("double tapping"));
		System.out.println(s.videoCall(true));
		System.out.println(s.connectivity(true));
	}
}
