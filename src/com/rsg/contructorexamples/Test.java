package com.rsg.contructorexamples;

public class Test {

	public static void main(String[] args) {
		
		
		Runtime runtime1 = Runtime.getRuntime();
		
		Runtime runtime2 = Runtime.getRuntime();
		
		System.out.println(runtime1.hashCode());
		
		System.out.println(runtime2.hashCode());
		
		//Runtime r1 = new Runtime();
		
		
		MySingleton mySingleton1 = MySingleton.getInstance();
		
		MySingleton mySingleton2 = MySingleton.getInstance();
		
		System.out.println(mySingleton1.hashCode());
		System.out.println(mySingleton2.hashCode());
		

	}

}
