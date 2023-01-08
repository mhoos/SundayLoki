package com.upskill.java_1;

public class MethodType {

	/*
	 * Types of Method
	 * 
	 * 1. void Method 2. Static Method 3. Return type Method
	 */
 
	public static int hourleyIncome = 65;
	
	
	
	public static void main(String[] args) {
		
		MethodType obj = new MethodType();
		
		weeklyIncomeStaic();
		System.out.println("My monthly Income = " + obj.monthlyIncomeReturn());
		obj.annualIncomeVoid();
			
	}
	
	public void annualIncomeVoid() {
		
		int calculateAnnualIncome = hourleyIncome * 2000;
		
		System.out.println("My Annual Income = " + calculateAnnualIncome);
	}
	
	// static Method
	
	public static void weeklyIncomeStaic() {
		
		int calculateWeeklyIncome = hourleyIncome * 40;
		
		System.out.println("My Weekly Income = " + calculateWeeklyIncome);
	}
	
	// return type method
	
	public int monthlyIncomeReturn() {
		
		int calculateMonthlyIncome = hourleyIncome * 180;
		
		return calculateMonthlyIncome;
	}

}
