package com.rsg.methods;

public class Calculation {

	public static void main(String[] args) {
		
		Calculation.add();
		
		Calculation.add(100);	
		
		Calculation.add(10,20);
		
		Calculation.add(10,20,30);
		
		Calculation.add(10,20,30,40);
		
		Calculation.add(1,2,3,4,5);
		

	}
	
	public static void add() {
		System.out.println("Zero argument method");
	}
	
	public static void add(int a) {
		System.out.println(a);
	}
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void add(int a ,int b, int c ,int d) {
		System.out.println(a+b+c+d);
	}
	
	public static void add(int a, int b, int c ,int d,int e) {
		System.out.println(a+b+c+d+e);
	}
	

}
