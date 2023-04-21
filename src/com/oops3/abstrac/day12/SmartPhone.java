package com.oops3.abstrac.day12;

public class SmartPhone implements Phone {

	public String voicCall(boolean a) {

		return "voice is available "+a;
		
	}

	public String videoCall(boolean b) {

		return "video is available "+b;
	}

	public String connectivity(boolean c) {

		return "good connectivity "+c;
	}

	public String cameraFunction(String tapping) {

		switch (tapping) {
		case "single tapping":
			return "Taking Picture";
		case "double tapping":
			return "Zooming";
		case "continuos tapping":
			return "Continuos Shots";

		default:
			return "invalid";

		}
	}

}
