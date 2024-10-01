package com.rsg.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		treeSet.add(6);
		treeSet.add(2);
		treeSet.add(1);
		treeSet.add(4);
		treeSet.add(5);
		treeSet.add(3);
		
		String str = null;

		Iterator<Integer> itr = treeSet.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
