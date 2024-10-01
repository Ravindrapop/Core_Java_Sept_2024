package com.rsg.flowcontrol;

public class SwitchDemo2 {

	public static void main(String[] args) {
		
		byte x = 10;
		
		switch(x+1) {
		case 10:
			System.out.println("10");
			break;
		case 100:
			System.out.println("100");
			break;
		case 1000:
			System.out.println("1000");
			break;
			default:
				System.out.println("case is not matche!");
			
		}

	}

}
