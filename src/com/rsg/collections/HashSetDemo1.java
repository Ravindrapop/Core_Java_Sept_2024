package com.rsg.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(4);
		hashSet.add(5);
		hashSet.add(2);
		hashSet.add(null);
		hashSet.add(null);
		Iterator<Integer> itr = hashSet.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
