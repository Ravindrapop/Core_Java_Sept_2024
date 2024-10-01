package com.rsg.flowcontrol;

public class OneToTenUsingDoWhile {

	public static void main(String[] args) {

		int i = 1;
		do {
			System.out.println(i); // 1
			i++;
		} while (i <= 10);

	}

}
