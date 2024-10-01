package com.rsg.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationExample {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Orange");
		
		Iterator<String> itr = arrayList.iterator();
		
		while(itr.hasNext()) {
			String fruit = itr.next();
			
			if(fruit.equals("Banana")) {
				arrayList.remove(fruit);
			}
			System.out.println(fruit);
		}
	}

}
