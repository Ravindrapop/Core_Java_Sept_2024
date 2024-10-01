package com.rsg.operators;

public class ConditionalOperatorDemo1 {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		
		int x = (a>50) ? 777 : ((b>100) ? 888 : 999);
		
		System.out.println(x);

	}

}
