package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymophism extends MethodType{
	
	/*
		Polymorphism is the ability of an object to take an many Forms.
	
		-Method overloading (compile time polymorphism/ static binding ) same method name with different signature to overload
		-Method overriding (Run time polymorphism/ dynamic binding) same method name from parent class to override
	
		*/
	
	public static void main(String[] args) {
		
		Polymophism obj = new Polymophism();
		
		obj.annualIncomeVoid();
		
/*		car();
		car(2);
		car("Red");
		car(4, "Honda"); */
		
	}
	
	public void annualIncomeVoid() {
		
		int calculateAnnualIncome = hourleyIncome * 2000;
		int bonus = 20000;
		int rentalIncome = 10000;
		int sideIncome = 20000;
		int newIncome = calculateAnnualIncome+bonus+rentalIncome+sideIncome;
		
		System.out.println("My Annual Income = " + newIncome);
	}
	
	public static void car() {
		
		System.out.println("My car is Audi");
		
	}
	public static void car(int door) {
		
		System.out.println("My car is Audi !, it has door " + door);
		
	}
	public static void car(String color) {
		
		System.out.println("My car is Audi ! color is " + color);
		
	}
	public static void car(int wheel,String make) {
		
		System.out.println("My car is " + make +" it has wheel "+wheel);
		
	}
	
	

}
