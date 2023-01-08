package com.upskill.java_1;

public class AccessModifire {

	public String name = "Russel"; // public - any class can access
	
	private int age = 25; // private - Only same class can access
	
	protected int ssn = 123456789; // protected - classes in the same package and subclass
	
	String address = "Heritage Tower"; // default classes in the same package can access

}
