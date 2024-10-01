package com.rsg.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo1 {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		hashMap.put(101, "Gourav");
		hashMap.put(102, "Akash");
		hashMap.put(103, "Avinash");
		hashMap.put(104, "Neha");
		hashMap.put(105, "Hari");
		hashMap.put(106, "Gourav");

		// System.out.println(hashMap);

		System.out.println("Fetch the map object using Iterator");
		Iterator<Map.Entry<Integer, String>> itr = hashMap.entrySet().iterator();

		while (itr.hasNext()) {

			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) itr.next();

			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println("Fetch the map object using for each:");
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("Fetch the hashMpa using advance for each:");
		hashMap.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});

	}

}
