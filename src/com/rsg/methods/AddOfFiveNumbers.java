package com.rsg.methods;

public class AddOfFiveNumbers {

	public static void main(String[] args) {
		
		
		int add = AddOfFiveNumbers.sum(10,20,30,40,50);
		
		System.out.println(add);
		
		

	}
	
	
	public static int sum(int a, int b, int c, int d, int e) {
		
		return a+b+c+d+e;
	}
	

}
