package com.rsg.operators;

import java.util.Objects;

public class Student {
	
	private int id;
	
	private String name;
	
	Student(int id, String name){
		
		this.id=id;
		this.name=name;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

}
