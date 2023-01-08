package com.upskill.assignment_2;

public class Assignment_2_3 {
	
	/* Problem3. Write two java functions which will return two different integer values,    
	write a program to compare those numbers and send message that one number is bigger than other. 
	(hints: using if..else)*/
	
	public static int a;
	public static int b;

	public static void main(String[] args) {
	
		a =function1();
		b=function2();
		numberCompaire();
		numberCompaire1();
	}
	
	public static int function1() {
		
		return 50;
	}
	public static int function2() {
		
		return 65;
	}
	
	
	
	public static void numberCompaire1() {
		
		if(a > b) {
			System.out.println("1st funnction is greater than 2nd function");
		}
		else {
			System.out.println("2nd funnction is greater than 1st function");
	}
		}
	
	public static void numberCompaire() {
		
		if(a > b) {
			System.out.println("1st funnction is greater than 2nd function");
		}
		if(b>a) {
			System.out.println("2nd funnction is greater than 1st function");
		}
	}
}
