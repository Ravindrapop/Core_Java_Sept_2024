package com.rsg.flowcontrol;

public class PrintTenToOne {

	public static void main(String[] args) {
		//10 9 8 7 6 5 4 3 2 1

		int i=10;
		while(i>=1) {
			System.out.println(i);  //10 
			i--;
		}

	}

}
