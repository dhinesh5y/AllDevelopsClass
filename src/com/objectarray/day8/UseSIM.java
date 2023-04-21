package com.objectarray.day8;

public class UseSIM {

	public static void main(String[] args) {
		
		SIM s1 = new SIM();
		s1.holderName="Airtel";
		s1.simNumber=9952077422l;
		s1.price=100;
		
		SIM s2 = new SIM();
		s2.holderName="Aircel";
		s2.simNumber=9952077434l;
		s2.price=120;
		
		SIM s3 = new SIM();
		s3.holderName="vodafone";
		s3.simNumber=9452077422l;
		s3.price=150;
		
		SIM s4 = new SIM();
		s4.holderName="Jio";
		s4.simNumber=9782077422l;
		s4.price=140;
		
		SIM s5 = new SIM();
		s5.holderName="Idea";
		s5.simNumber=8855077422l;
		s5.price=170;
		
		SIM[] sims = {s1, s2, s3, s4, s5};
		
		String mins = null;  int min = sims[0].price;
		
		for (int i = 0; i < sims.length; i++) {
			
			if(sims[i].price<=min){
				min=sims[i].price;
				mins=sims[i].holderName;
			}
		}
		System.out.println(mins);

	}

}
