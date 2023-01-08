package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
		
		// Array store multiple data using index // Array allow duplicate value
		
		int age = 30;	// variable
		
		int[] ageLoki= new int[] {25, 30, 35, 38, 40}; // Array
		
		// Array Index [0] [1] [2] [3] [4] [5]
		
		String[] nameLoki= new String[] {"Russel", "Arsh", "Eza", "Omar", "Kader"}; 
		
		System.out.println("Total number of student " + nameLoki.length );
		
		System.out.println("Student name "+ nameLoki[2]);
		
		
		// Multi-dimentional Array
		 
		int [][] ageLoki2D = {{25, 30, 35, 38, 40},		// [0][0] [0][1] [0][2] [0][3] [0][]4
							{67, 24, 51}};				// [1][0] [1][1] [1][2] [1][3] [1][]4
		
		System.out.println(ageLoki2D[0][3]);
		System.out.println(ageLoki2D[1][2]);
		
		// Hashmap store multiple data using key-value pair, implementation of map interface
		// hashmap allow duplicate value but key is unique
		
		HashMap<String,Integer> student = new HashMap<String,Integer>();
		
		student.put("Anik", 25);
		student.put("Arsh", 12);
		student.put("Asif", 35);
		student.put("Akter",36);
	
		System.out.println("HashMap Student age : "+ student.get("Arsh"));
		
		HashMap<String,String> capital = new HashMap<String,String>();
		
		capital.put("BD", "Dhaka");
		capital.put("USA", "Washington DC");
		
		System.out.println("The capital city is : "+ capital.get("BD"));
		
		// Hashset store unordered collection containing unique value, implementation of set interface
		// Hashset doesn't allow duplicate
		
		HashSet<String> car = new HashSet<String>();
		
		car.add("Honda");
		car.add("BMW");
		car.add("Audi");
		
		System.out.println("car : " +car);
		
		// HashTable store multiple data using key-value pair, but is synchronized (Only one thread can modify)
		//HashTable doesn't allow duplicate both key and value
		

		Hashtable<String, String> Region = new Hashtable<String, String>();
		
		Region.put("BD", "Asia");
		Region.put("USA", "America");
		Region.put("USA", "America");
		
		System.out.println("Region : " + Region.get("BD"));
		
	}		
	
}



















