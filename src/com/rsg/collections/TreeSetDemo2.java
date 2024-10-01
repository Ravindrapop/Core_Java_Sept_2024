package com.rsg.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		
		TreeSet<Student> treeSet = new TreeSet<>();
		
		treeSet.add(new Student(101, "Gourav"));
		treeSet.add(new Student(104,"Akash"));
		treeSet.add(new Student(103,"Pooja"));
		treeSet.add(new Student(102,"Neelesh"));
		
		Iterator<Student> itr = treeSet.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
