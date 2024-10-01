package com.rsg.map;

import java.util.TreeMap;

public class TreeMapDemo2 {

	public static void main(String[] args) {
		
		TreeMap<Employee, String> treeMap = new TreeMap<Employee, String>();
		
		treeMap.put(new Employee(103, "Poonam"), "Bhind");
		treeMap.put(new Employee(101, "Shyam"), "UP");
		treeMap.put(new Employee(100,"Avinash"), "Pune");
		treeMap.put(new Employee(104,"Neha"), "Nagpur");
		treeMap.put(new Employee(105,"Pooja"), "Gwalior");
		
		
		treeMap.forEach((key, value)->{System.out.println(key+" "+value);});

	}

}
