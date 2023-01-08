package com.upskill.assignment_1;

public class Assignment_1_3 {
	
	/*
	 * A Function which returns the multifly value of a and b where a = 9 b = 11.
	 * write a program which will display addition of a+b+ function returns value
	 */

	public static void main(String[] args) {
		
		int a = 10;
		
		int b = 11;
		int multiflyValue = functionMultifly(a,b);
		
		System.out.println(a+b+multiflyValue);
		
		
	}
	
	public static int functionMultifly(int a, int b) {
		
		
		return a*b;
	}

}
