package com.upskill.java_1;

public class Variables {
	
	
	// variable in java
	
	public String country = "USA"; // Instance or Global variable - Variable declare in class level, outside method
	
	public static String region = "America"; // Static variable - variable belong to class and don't require creating object
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String city = "NEW YORK";	// Local Variable - variable declared in method
		
		method("Essex");
		
	}

	public static void method (String country) {	// Method parameter - variable used as method parameter
		
		/*
		 * String myCountry = country; String city = "Bloomfield";
		 */
		
		int a= 10;
		int b= 20;
		b=a +b -(a=b);
		//a=b;
		System.out.println(a +" "+ b);
		
	}
	public  void test (String country) {
		
		String city = "Buffalo";
		
	}

}
