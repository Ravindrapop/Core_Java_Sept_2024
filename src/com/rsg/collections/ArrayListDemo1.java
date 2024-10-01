package com.rsg.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		arrayList.add(20);
		arrayList.add(null);

		System.out.println("Iterate the arrayList using normal loop"); 
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		System.out.println("Iterate the arrayList using for each loop"); 
		
		for(Integer i:arrayList) {
			System.out.println(i);
		}
		
		System.out.println("Fetching the arrayList using iterator"); 
		
		Iterator<Integer> itr = arrayList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println("Fetching the arrayList using advance for each");
		
		arrayList.forEach((e)->{System.out.println(e);});
		

	}

}
