package com.oops1.encaps.day10;

public class UseLibrary {

	public static void main(String[] args) {
		
		Book b = new Book();
		b.author="muthukumar";
		b.pages=350;
		
		Library l = new Library();
		l.book=b;
		l.location="tambram";
		l.capacity=1500;
		l.isOldBook=true;
		
		System.out.println(l.location+" "+l.isOldBook+"\n"+l.book.author+" "+l.book.pages);

	}

}
