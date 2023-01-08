package com.upskill.java_3;

import com.upskill.java_1.MethodType;

public class Inheritance extends MethodType{
	
	public static void main(String[] args) {
		/*	
			The process of obtaining data members and methods from one class to another class is known as inheritance
			- Single inheritance 
			- Multiple inheritance 
			- Multi-level inheritance
		*/
		Inheritance obj = new Inheritance();
		
		obj.annualIncomeVoid();
		System.out.println("My Monthly Income = " +obj.monthlyIncomeReturn());
		obj.weeklyIncomeStaic();
		
	}

}
