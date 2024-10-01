package com.rsg.threads;

public class MyRunnableClient {

	public static void main(String[] args) {
		
		MyRunnableThread myRunnable = new MyRunnableThread();
		
		Thread thread = new Thread(myRunnable);
		
		thread.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}

	}

}
