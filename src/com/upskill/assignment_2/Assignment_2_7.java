package com.upskill.assignment_2;

public class Assignment_2_7 {
	
	/* Problem7. You are given two integer number (a=25, b=30),  
	write a program to swap them and display result on the screen. */
	
	public static void main(String[] args) {
		swapNumber();
	}
	
	public static void swapNumber() {
		
		int a = 25;
		int b = 30;
		
		int switchNumber;
		
		switchNumber=a;
		a=b;
		b=switchNumber;
		
		System.out.println("After switch B is "+b+ " and A is "+ a);
		System.out.println(a+" "+b);
	}

}
