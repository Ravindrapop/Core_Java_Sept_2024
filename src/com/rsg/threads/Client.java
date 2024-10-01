package com.rsg.threads;

public class Client {

	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		
		myThread.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}

	}

}
