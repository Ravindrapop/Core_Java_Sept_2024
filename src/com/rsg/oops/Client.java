package com.rsg.oops;

public class Client {

	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		
		p1.m1();
		
		Child c1 = new Child();
		
		c1.m1();
		
		Parent p2 = new Child();
		
		p2.m1();
		

	}

}
