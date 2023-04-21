package com.objectarray.day8;

public class UseFruit {

	public static void main(String[] args) {
		
		Fruit f1 = new Fruit();
		f1.name="Fig";
		f1.price=50;
		f1.isHybrid=true;
		
		Fruit f2 = new Fruit();
		f2.name="Mango";
		f2.price=40;
		f2.isHybrid=true;
		
		Fruit f3 = new Fruit();
		f3.name="Watermelon";
		f3.price=30;
		f3.isHybrid=true;
		
		Fruit f4 = new Fruit();
		f4.name="Apple";
		f4.price=70;
		f4.isHybrid=false;
		
		Fruit f5 = new Fruit();
		f5.name="Strawberry";
		f5.price=80;
		f5.isHybrid=false;
		
		Fruit [] fruits ={f1, f2, f3, f4, f5};
		
		Fruit temp= null;
		for (int i = 0; i < fruits.length; i++) {
			if(fruits[i].isHybrid==true){
//				System.out.println(fruits[i].name+" "+fruits[i].price);
				
				temp= fruits[i];
				System.out.println(temp.isHybrid);
			}
			
		}
		

	}

}
