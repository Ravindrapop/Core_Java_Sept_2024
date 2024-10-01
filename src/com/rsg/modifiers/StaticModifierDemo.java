package com.rsg.modifiers;

public class StaticModifierDemo {
	
	int x = 10;
	
	static int y = 20;
	
	

	public static void main(String[] args) {
		
		StaticModifierDemo staticModifierDemo1 = new StaticModifierDemo();
		
		staticModifierDemo1.x=888;
		staticModifierDemo1.y=999;
		
		StaticModifierDemo staticModifierDemo2 = new StaticModifierDemo();
		
		System.out.println(staticModifierDemo2.x+"     "+staticModifierDemo2.y);

	}

}
