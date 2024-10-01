package com.rsg.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<String>();
		
		vector.add("Gourav");
		vector.add("Akash");
		vector.add("Neha");
		vector.add("Komal");
		vector.add("Avinash");
		vector.add("Gourav");
		vector.add(null);
		
		
		System.out.println(vector);
		
		Enumeration<String> en = vector.elements();
		
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		

	}
	
	

}
