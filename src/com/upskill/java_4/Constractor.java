package com.upskill.java_4;

public class Constractor {
	
	/* Constructor is instance of a class, method same as class name, java execute Constructor first
	 -	Constructor cannot be static or override nor void or return type 
	 -	default Constructor : no Constructor is initialized  
	 -	parameterized Contractor : Add different signature
	 -	Constructor overloading  : different signature
	 - 	Constructor help us to construct our java class if you want to modify your java class you can use constructor
	 -	through Constructor we can pass data inside or outside of the class
	 */
	
	String studentName;
	int studentAge;
	
	public Constractor(String name, int age) {
		studentName = name;
		studentAge = age;
		}
	public Constractor(String name) {
		
		studentName = name;
	}
	public Constractor(int age) {
		
		studentAge = age;
	}
	
	public static void main(String[] args) {
		
		Constractor obj1 = new Constractor("Arsh", 8);
		System.out.println(obj1.studentName);
		System.out.println(obj1.studentAge);
		Constractor obj2 = new Constractor("Ayana");
		System.out.println(obj2.studentName);
		Constractor obj3 = new Constractor( 2);
		System.out.println(obj3.studentAge);
		
	}

}

















