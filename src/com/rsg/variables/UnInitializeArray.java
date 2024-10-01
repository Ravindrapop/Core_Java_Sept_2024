package com.rsg.variables;

public class UnInitializeArray {
	
	int[] a = new int[3];
	
	
	public static void main(String[] args) {
		
		Object obj = new Object();
		
		UnInitializeArray unInitializeArray = new UnInitializeArray();
		
		System.out.println(unInitializeArray.a);
		
		System.out.println(unInitializeArray.a[0]);
		
		System.out.println(unInitializeArray);
		

	}

}
