package com.rsg.methods;

public class Test {
	
	public static void m1(int...x) {
		System.out.println("var arg method!");
		
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
	}
	

	public static void main(String[] args) {
		
	//	m1();
	//	m1(10);
	//	m1(10,20);
		m1(10,20,30);
		

	}

}
