package com.rsg.interfaces;

public class Test implements Right, Left{
	
	
	@Override
	public void m1() {
		System.out.println("m1 from test class");
	}
	
	
	
	public static void main(String[] args) {
		
		//System.out.println(x);   // The field x is ambiguous to resolve use Right.x and Left.x
		
	}
	
	
	
}
