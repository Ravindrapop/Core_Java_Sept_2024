package com.rsg.map;

import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		treeMap.put(100, "ZZZ");
		treeMap.put(103, "YYY");
		treeMap.put(101, "XXX");
		treeMap.put(104, "AAA");
		treeMap.put(105, "BBB");
		treeMap.put(102, null);
		treeMap.put(100, "DDD");
		
		System.out.println(treeMap);

	}

}
