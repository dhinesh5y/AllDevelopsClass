package com.oops2.Iherit.poly.day11;

public class UseAxisBank {

	public static void main(String[] args) {
		
		AxisBank a = new AxisBank();
		a.branch="Perungudi";
		a.accHolderName="Dhinesh";
		a.isPrivate=true;
		System.out.println(a.branch+" "+a.findIntrestAmount(25000)+" "+a.isPrivate);
		
	}

}
