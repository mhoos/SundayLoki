package com.upskill.java_6;

public class MultiThreading {
	
	/*	Multithreading is a java feature that allows concurrent execution of two or more part of a program.
	
	Thread can be created by using two machanism
	
	1. Extending the thread class
	2. implementing the runnable interface */
	
	public static void main(String[] args) {
	
		int n = 4;	// number Of Thread
		
		for(int i=0; i < n;i++) {
			
			MultiThreadingDemo obj= new MultiThreadingDemo();	// obj for extending the thred class
			Thread obj2 = new Thread(new MultiThreadingDemo2()); // obj for imoplementing  the Runnable interface
			obj.start();
			obj2.start();
		}

	}

}

class MultiThreadingDemo extends Thread {		// extending the thread class
	
	public void run () {
		try {
			System.out.println("Thread " + Thread.currentThread().getId() + "is running");
		}catch (Exception e) {
			
			System.out.println("Exception is caught");
		}
	
	}
}
class MultiThreadingDemo2 implements Runnable {		// implementing runnable interface
	
	public void run () {
		try {
			System.out.println("Thread " + Thread.currentThread().getId() + "is running");
		}catch (Exception e) {
			
			System.out.println("Exception is caught");
		}
	
	}
}

