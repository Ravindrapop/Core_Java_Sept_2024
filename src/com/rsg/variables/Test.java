package com.rsg.variables;

public class Test {
	
	int x = 10;
	static int y = 20;
	

	public static void main(String[] args) {
		
		Test test1 = new Test();
		
		test1.x=888;
		
		test1.y=999;
		
		Test test2 = new Test();
		
		System.out.println(test2.x+" "+test2.y);   // 10   

	}

}
