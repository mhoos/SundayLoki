package com.upskill.java_6;

public class Singleton {
	
	// 	one class one object thats called Singleton
		
	//	  Singleton is a class that can have only one object
		  
	//	  Private constructor, it prevents any other class from instantiating
	
		  private Singleton() {
			  
			 
			  
		  }
		 
	 //	Private static object of the class 
		  
		  private static Singleton SingletonObj = new Singleton(); //regular Singleton SingletonObj = new Singleton();
		  
	//	  public Static instance method	 
	    
		  public static Singleton getInstance() {
			  System.out.println("I am return type method");
			  return SingletonObj;
		  }
		  
		  protected static void  upskill() {
			  
			  System.out.println("Upskill method from singleton class");
			  System.out.println("getInstance method is only public ");
		  }
}
