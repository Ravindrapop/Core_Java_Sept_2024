package com.rsg.comparatorandcomparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentClient {

	public static void main(String[] args) {
		
		ArrayList<Student> arrayList = new ArrayList<Student>();
		
		arrayList.add(new Student(103,"Gourav","Gwalior"));
		arrayList.add(new Student(101, "Shyam", "Baranashi"));
		arrayList.add(new Student(102, "Avinash", "Pune"));
		arrayList.add(new Student(104,"Poonam","Bhind"));
		arrayList.add(new Student(105,"Neelesh","Gwalior"));
		
		// Display message on console for better readability
        System.out.println("Unsorted");
        
        for(int i=0;i<arrayList.size();i++) {
        	System.out.println(arrayList.get(i));
        }
        
        Collections.sort(arrayList, new SortedByRollNo());
        
        // Display message on console for better readability
        System.out.println("\nSorted by rollno");
        
        for(int i=0;i<arrayList.size();i++) {
        	System.out.println(arrayList.get(i));
        }
        
        Collections.sort(arrayList, new SortedByName());
        
        // Display message on console for better readability
        System.out.println("\nSorted by name");
        for(int i=0;i<arrayList.size();i++) {
        	System.out.println(arrayList.get(i));
        }
        

	}

}
