package com.rsg.threads;

public class Test {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Gourav_Thread");
		System.out.println(Thread.currentThread().getName());

	}

}
