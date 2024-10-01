package com.rsg.oops;

public class Demo {
	
	public void m1(Object obj) {
		System.out.println("Object version");
	}
	
	public void m1(String s) {
		System.out.println("String version");
	}

	public static void main(String[] args) {
		
		Demo demo = new Demo();
		
		demo.m1(new Object()); //Object version
		
		demo.m1("durga"); // String version
		
		demo.m1(null); //String version
		
		

	}

}
