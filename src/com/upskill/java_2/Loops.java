package com.upskill.java_2;

public class Loops {
	
	/*	
	Types of loops
	1. For Loop
	2. while loop
	3. do while loop
	4. Infinite loop
	
	*/

	public static void main(String[] args) {
	
		//PracticeForLoop();
		//PracticeForLoop2();
		//PracticeWhileLoop();
		//practiceDoWhileLoop();
		NestedForLoop();
		
	}
	// for loop
	public static void PracticeForLoop() {				// For Loop - do again and again upto upper limit
		
		int i; 										// initialize the variable
		for(i =1; i<=10; i++) {					// setting lower limit, upper limit, Increment or decrement 
			
			System.out.println("For Loop Number = " + i); // Statement
		}								
	
	}
	// Decrement For loop
	public static void PracticeForLoop2() {				// For Loop - do again and again upto upper limit
		
		int i; 										// initialize the variable
		for(i = 10; i>=1; i--) {					// setting lower limit, upper limit, Increment or decrement 
			
			System.out.println("For Loop Number = " + i); // Statement
		}								
	
	}
	// --- While Loop
		public static void PracticeWhileLoop() {				// While Loop - do again and again upto condition match
			
			int i=1; 										// initialize the variable
			while(i<=10) {									// setting condition
				
				System.out.println("While Loop Number = " + i);// Statement increment or decrement
				i++;											//increment or decrement
				
			}
			
			}
		
		// do while loop
	public static void practiceDoWhileLoop() {	// do while loop - do action then match condition
			
			int i = 1;
			
			do {
				System.out.println("Do While Loops number " + i);	// statement
				i++;												// increment
			} while (i<=5);											// checking condition
			}
	
	
	public static  void NestedForLoop() {
		
		int i;
		int j;
		for(i = 1; i<=10; i++) {
			for(j=1; j<=10; j++) {
				int multificationTable= i*j;
			System.out.print(multificationTable+" ");
			
		}
			System.out.println();
			
		}
		
		
	}
	
	
	
}











