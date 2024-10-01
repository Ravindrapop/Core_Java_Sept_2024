package com.rsg.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<>();
		
		linkedList.add("Shyam");
		linkedList.add("Gourav");
		linkedList.add("Komal");
		linkedList.add("Neha");
		linkedList.add("Poonam");
		
		Iterator<String> itr = linkedList.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
