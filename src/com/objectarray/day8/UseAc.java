package com.objectarray.day8;

public class UseAc {

	public static void main(String[] args) {
		
		Ac ac1 = new Ac();
		ac1.brand="Voltos";
		ac1.price=36000;
		ac1.ton=1.5f;
		
		Ac ac2 = new Ac();
		ac2.brand="LG";
		ac2.price=30000;
		ac2.ton=1.5f;
		
		Ac ac3 = new Ac();
		ac3.brand="Onida";
		ac3.price=38000;
		ac3.ton=1.5f;
		
		Ac ac4 = new Ac();
		ac4.brand="Samsung";
		ac4.price=28000;
		ac4.ton=1.5f;
		
		Ac ac5 = new Ac();
		ac5.brand="Whirlpool";
		ac5.price=27000;
		ac5.ton=1.5f;
		
		Ac[] acs = {ac1, ac2, ac3, ac4, ac5};
		
		int  max = acs[0].price;
		Ac a = null;
		for (int i = 0; i < acs.length; i++) {
			if(acs[i].price<=max){
				max=acs[i].price+(acs[i].price*10)/100;
				a=acs[i];
			}
			
		}
		System.out.println(a.brand+" "+a.price+" "+a.ton);

	}

}
