package com.rsg.arrays;

public class Customer {
	
	private int id;
	private String name;
	
	public Customer(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}




	public static void main(String[] args) {
		Customer customer1 = new Customer(101, "Shyam");
		
		Customer customer2 = new Customer(102,"Sandhya");
		
		customer1.setId(1001);
		
		customer1.setName("Ram");
		
		System.out.println(customer1.getName());
		
		System.out.println(customer1.name);
	}

}
