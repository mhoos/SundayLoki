package com.upskill.assignment_2;

public class Assignment_2_5 {
	
	/* Problem5. Write a program in Java to display the multiplication table of (eight)8.*/
	public static void main(String[] args) {
		
		myMethod();
		int i;
		int j;
		
			for(i=1;i<=8;i++) {
				for(j=1; j<=8; j++) {
					System.err.print(i*j+ " ");
					
			}
				System.err.println();
		}
		
	}
	public static void myMethod() {
		
		for (int row = 1; row <= 8; row++) {
			for (int col = 1; col <= 8; col++) {
				int MultiplicationTable = row * col;
				System.out.print(MultiplicationTable + " ");
			}
			System.out.println("");
		}
	}
}
