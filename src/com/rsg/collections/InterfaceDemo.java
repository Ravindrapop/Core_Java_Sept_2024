package com.rsg.collections;

public class InterfaceDemo implements MyInterface  {
	
	@Override
	public void wish() {
		System.out.println("Hi good morninng all!");
	}
	
	public static void main(String[] args) {
		InterfaceDemo interfaceDemo = new InterfaceDemo();
		
		interfaceDemo.wish();
		
		MyInterface myInterface = new MyInterface() {
			
			@Override
			public void wish() {
				System.out.println("Hi good morning all!!!");
			}
			
		};
		
		myInterface.wish();
		
		
		MyInterface myInterface2 = ()->{
			System.out.println("Hi good morning all!!!!!!!");
		};
		
		myInterface2.wish();
		
		
		
		
		
	}

}
