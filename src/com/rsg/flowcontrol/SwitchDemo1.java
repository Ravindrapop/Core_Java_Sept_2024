package com.rsg.flowcontrol;

public class SwitchDemo1 {

	public static void main(String[] args) {
		
		int a = 3;
		
		switch(a) {
		
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("Entered number is not matched.");
		}

	}

}