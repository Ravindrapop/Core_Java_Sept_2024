package com.rsg.operators;

public class Test {

	public static void main(String[] args) {
		
		Student s1 = new Student(101,"Akash");
		
		Student s2 = new Student(101,"Akash");
		
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));
		
		
		System.out.println(s1 instanceof Student);
		
		System.out.println(s1 instanceof Object);

	}

}
