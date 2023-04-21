package com.coll2.map.day15;

import java.util.HashMap;

import org.omg.Messaging.SyncScopeHelper;

public class LMSTest {

	public static void main(String[] args) {
		
		HashMap<Integer, String> lms  = new HashMap<>();
		lms.put(1130, "Dhinesh");
		lms.put(1131, "Vivek");
		lms.put(1128, "Sajin");
		lms.put(1124, "Sundar");
		
//		for (Integer x : lms.keySet()) {
//			System.out.println(x);
//		}
//		System.out.println(" ");
//		for (String y : lms.values()) {
//			System.out.println(y);
//		}
//		System.out.println(" ");
//		for (Integer z : lms.keySet()) {
//			System.out.println(lms.get(z));
//		}
//		System.out.println("");
//		
//		lms.forEach((x,y)->System.out.println(y+" "+x) );
		
//		lms.forEach((x,y)->{
//			if(x%2==0){
//				System.out.println(x+" even");
//			}
//			else{
//				System.out.println(x+" odd");
//			}
//		});
		
//		lms.forEach((x,y)->{
//			if(y.contains("a")||y.contains("u")||y.contains("o")){
//				System.out.println(y);
//			}
//		});
		
		for (Integer x : lms.keySet()) {
			if(lms.get(x).contains("a")||lms.get(x).contains("u")){
				System.out.println(lms.get(x)+" Vowels contain");
			}
		}
		
	}

}
