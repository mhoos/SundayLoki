package com.upskill.assignment_2;

public class Assignment_2_6 {
	/* Problem6. Write a java program to find the prime number from 1 to 100 and print them.*/
	
	public static void prime(int number) {
		
		for(int i=2;i<=number; i++) {
			int count  =0;
				for(int j=2;j<i;j++) {
					if(i%j==0) {
						count++;
				 }
			}
				if(count==0) {
					System.out.println(i+ " ");
				}
		}
		
	}
	public static void main(String[] args) {
		//myMethod();
		prime(100);
		
	}
//	public static void myMethod(){
//		int upperbound = 100;
//		for (int number = 2; number <= upperbound; ++number) {
//
//			int maxFactor = (int) Math.sqrt(number);
//			boolean isPrime = true;
//			int factor = 2;
//			while (isPrime && factor <= maxFactor) {
//				if (number % factor == 0) {
//					isPrime = false;
//				}
//				++factor;
//			}
//
//			if (isPrime)
//				System.out.println(number + " is a prime");
//		}}

}
