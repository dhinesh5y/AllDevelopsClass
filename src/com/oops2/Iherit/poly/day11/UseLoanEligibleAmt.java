package com.oops2.Iherit.poly.day11;

public class UseLoanEligibleAmt {

	public static void main(String[] args) {


		LoanEligible l = new LoanEligible();
		System.out.println(l.loanEligibleAmt());
		System.out.println(l.loanEligibleAmt(35000));
		System.out.println(l.loanEligibleAmt(35000, 2000000));
		
	}

}
