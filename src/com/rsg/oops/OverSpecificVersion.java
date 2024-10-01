package com.rsg.oops;

public class OverSpecificVersion {
	
	public void m1(StringBuffer sb) {
		System.out.println("StringBuffer version");
	}
	
	public void m1(String s) {
		System.out.println("String version");
	}

	public static void main(String[] args) {
		
		OverSpecificVersion overSpecificVersion = new OverSpecificVersion();
		
		overSpecificVersion.m1(new StringBuffer("Durga"));
		
		overSpecificVersion.m1("Akash");
		
		//overSpecificVersion.m1(null);

	}

}
