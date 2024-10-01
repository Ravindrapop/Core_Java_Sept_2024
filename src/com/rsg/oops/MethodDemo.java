package com.rsg.oops;

public class MethodDemo {
	
	public int addTwoNumber(int a, int b) {
		
		int sum = a+b;
		
	//	System.out.println(sum);
		
		return sum;
	}

	public static void main(String[] args) {
		
		MethodDemo methodDemo = new MethodDemo();
		
		int a = methodDemo.addTwoNumber(5,10);
		
		System.out.println(a);
		
		int b = methodDemo.addTwoNumber(10,20);
		System.out.println(b);
		
		int c = methodDemo.addTwoNumber(50,100);
		System.out.println(c);

	}

}
