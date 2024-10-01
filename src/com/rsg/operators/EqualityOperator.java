package com.rsg.operators;

public class EqualityOperator {
	
	

	public static void main(String[] args) {
		//==, !=
		
		System.out.println(10==10.0);
		System.out.println('a'==98);//97==98
		System.out.println(true==false);
		System.out.println(10.5!=12.5);
		
		EqualityOperator equalityOperator1 = new EqualityOperator();
		EqualityOperator equalityOperator2 = new EqualityOperator();
		
		System.out.println(equalityOperator1==equalityOperator2);
		
		Object obj = null;

	}

}
