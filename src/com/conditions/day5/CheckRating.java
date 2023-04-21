package com.conditions.day5;

public class CheckRating {

	public static void main(String[] args) {

		int rating = 4;

		if (rating == 1) {
			System.out.println(rating + " very poor rating");
		} else if (rating == 2) {
			System.out.println(rating + " poor rating");
		} else if (rating == 3) {
			System.out.println(rating + " good rating");
		} else if (rating == 4) {
			System.out.println(rating + " very good rating");
		} else if (rating == 5) {
			System.out.println(rating + " excellent rating");
		} else if (rating == 0) {
			System.out.println(rating + " invalid rating");
		}
	}

}
