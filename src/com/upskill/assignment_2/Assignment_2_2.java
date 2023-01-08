package com.upskill.assignment_2;

public class Assignment_2_2 {
	
	/* Problem2. A school conducts a 100 mark exam for its student and grades them as follows:  
	Grade:
		Grade A: Marks>=90
		Grade B: Marks>=80-89
		Grade C: Marks>=70-79
		Grade D: Marks>=60-69 AND FAIL THEM WHO HAS <60
	Write a java program to calculate the grade for a student in a method passing parameter for grade 
	to display every grade type, using if..else statement. */
	
	
	public static void main(String[] args) {
		
			examGrade(100);
			
			
	
	}
	
	public static void examGrade(int marks) {
		
		
		
		if (marks>=90 && marks<=100) {
			System.out.println("Your Grade is A ");
		} else if(marks <90 && marks>=80){
			System.out.println("Your Grade is B");
		}else if(marks <80 && marks>=70) {
			System.out.println("Your Grade is C");
		}else if(marks <70 && marks>=60) {
			System.out.println("Your Grade is D");
		}else {
			System.out.println("You Are Fail !!!");
		}
	}
}
