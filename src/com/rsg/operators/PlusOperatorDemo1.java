package com.rsg.operators;

public class PlusOperatorDemo1 {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=30;
		String d = "Gourav";
		
		System.out.println(a+b+c+d); // 60Gourav
		
		System.out.println(a+b+d+c); //30Gourav30
		
		System.out.println(d+a+b+c); //Gourav102030
		
		System.out.println(a+d+b+c); //10Gourav2030 

	}

}
