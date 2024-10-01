package com.rsg.arrays;

public class Student {
	  private int id;
	  
	  private String name;
	  
	  static String collegeName="GICTS";
	  Student(int id, String name){
		  this.id=id;
		  this.name=name;
	  }
	public static void main(String[] args) {
		
		Student s1 = new Student(101, "Dipti");
		
		Student s2 = new Student(102, "Neha");
		
		Student s3 = new Student(103, "Satish");
		
	}

}
