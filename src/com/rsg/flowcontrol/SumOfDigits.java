package com.rsg.flowcontrol;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int number = 32165467;
		
		int rem = 0;
		
		int sum = 0;
		
		while(number>0) {     
			rem = number%10;   
			sum=sum+rem;     // sum+=rem;  
			number = number/10;    
		}
		System.out.println(sum);

	}

}
