package com.oops3.abstrac.day12;

public class OnlineCourse implements Course {

	
	public int courseId(int a) {
		return a;
	}

	public String courseURL(String url) {
		return url;
	}

	public boolean courseIs30Days(boolean is30days) {
		return is30days;
	}
	
	public String courseTrainerName(String b){
		return b;
		
	}
	
	public String courseNameWithFees(String courseName){
		
		if(courseName.equalsIgnoreCase("Java")){
			return courseName+" Fees = 20000";
		}
		else if(courseName.equalsIgnoreCase("sql")){
			return courseName+" Fees = 18000";
		}
		else if(courseName.equalsIgnoreCase("python")){
			return courseName+" Fees = 13000";
		}
		else if(courseName.equalsIgnoreCase("")){
			return courseName+" Fees = 18000";
		}
		else {
			return courseName +" invalid"
					+ "";
		}
		
	}
}
