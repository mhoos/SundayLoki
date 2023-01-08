package com.upskill.assignment_2;

public class Assignment_2_9 {
	
	/* Problem9. Write a program to swap two string variables (Talen, Tech) and display result on the screen. */
	
	public static void main(String[] args) {
		stringSwap();
	}
	
	public static void stringSwap() {
		
	String a = "Talen";
		String b= "Tech";
		 String c=a;
		  a=b;
		   b=c;
			 System.out.println("After swap a : "+a+" "+"After swap b : "+b);
		
	}

}
