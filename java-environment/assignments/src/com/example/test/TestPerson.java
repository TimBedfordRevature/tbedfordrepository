package com.example.test;

import labs5.Person;
import labs5.Developer;

public class TestPerson {
	
	public static void main(String[] args) {
		Person adam = new Developer();
		
		adam.setName("Adam");
		System.out.println(adam.getName());
	}

}
