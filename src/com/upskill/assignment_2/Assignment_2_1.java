package com.upskill.assignment_2;

public class Assignment_2_1 {
	/* Problem1. Write a for loop that prints 50 through 1 separated by spaces in the same line.*/
	
	public static void main(String[] args) {
		
		forloopIncremental();
		System.out.println();
		forloop();
	}
	
	public static void forloopIncremental(){
		
		int i;
		for(i = 1; i<=50; i++) {
			System.out.print(" "+i);
		}
	}
	
	public static void forloop(){
		
		int i;
		for(i = 50; i>=1; i--) {
			System.out.print(" "+i);
		}
	}
	
	
}
