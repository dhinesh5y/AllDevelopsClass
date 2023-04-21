package com.oops2.Iherit.poly.day11;

public class UseAnimal {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.dogName="Puppy";
		d.breed="Foriegn";
		d.isHomePet=true;
		d.price=2500;
		
		System.out.println(d.dogName+" "+d.findDogPrice(10)+" "+d.breed+" "+d.price);
		
		Hourse h = new Hourse();
		h.hourseName="Jackie";
		h.breed="Indian";
		h.isHomePet=false;
		h.price=30000;
		
		System.out.println(h.hourseName+" "+h.findHourseNetPrice(12)+" "+h.breed+" "+h.price);
		
		
		
	}

}
