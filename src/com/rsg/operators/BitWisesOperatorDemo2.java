package com.rsg.operators;

public class BitWisesOperatorDemo2 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 15;
		if(++x<10 && ++y<15) {
			++x;
			
		}else {
			++y;
		}
		System.out.println(x+"  "+y);

	}

}
