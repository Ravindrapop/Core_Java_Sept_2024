package com.rsg.comparatorandcomparable;

import java.util.ArrayList;
import java.util.Collections;

public class LambdaExample {

	public static void main(String[] args) {

		ArrayList<Student> arrayList = new ArrayList<Student>();

		arrayList.add(new Student(103, "Gourav", "Gwalior"));
		arrayList.add(new Student(101, "Shyam", "Baranashi"));
		arrayList.add(new Student(102, "Avinash", "Pune"));
		arrayList.add(new Student(104, "Poonam", "Bhind"));
		arrayList.add(new Student(105, "Neelesh", "Gwalior"));
		
		Collections.sort(arrayList, (o1,o2)->o1.getName().compareTo(o2.getName()));
		
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println("Sorting using roll no: ");
		Collections.sort(arrayList, (s1,s2)->s1.getRollNo()-s2.getRollNo());
		
		arrayList.forEach((list)->System.out.println(list));

	}

}
