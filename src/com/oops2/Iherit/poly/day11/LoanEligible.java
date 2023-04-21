package com.oops2.Iherit.poly.day11;

public class LoanEligible {
	
	public int loanEligibleAmt(){
		return 30000;
	}
	
	public int loanEligibleAmt(int salary){
		return 30000+(salary*5);
	}
	public int loanEligibleAmt(int salary, int propertyValue){
		return 30000+(salary*5)+(propertyValue*10);
	}

}
