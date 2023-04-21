package com.testday2;

public class TestQues40Use {
	
	public static void main(String[] args) {
		
		TestQues40 e1 = new TestQues40();
		e1.empId=2421;
		e1.empName="Dhinesh";
		e1.empDob="07/06/1991";
		e1.empMob=9952077422l;
		
		TestQues40 e2 = new TestQues40();
		e2.empId=2421;
		e2.empName="Suresh";
		e2.empDob="17/04/1986";
		e2.empMob=9952077437l;
		
		String s = "+91";
		
		System.out.println(e1.empName+" "+s+e1.empMob);
		System.out.println(e2.empName+" "+s+e2.empMob);
		
	}
}
