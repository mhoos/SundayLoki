package com.upskill.java_4;

public class Encapsulation {
	
	// Encapsulation is used to hide the data using setter and getter method
	
	private String name = "Upskill"; // write and read 
	private int ssn = 123456789;	// write only
	private String userName = "Upskill"; //read only
	
	// setter method - name			//set the data, write
	
	public void setName(String value) {
		name = value;
		
	}
	// Getter method - name		// get the data, read
	 public String getName() {
		 
		 return name;
	 }
	// setter method ssn
	 public void setSsn(int value) {
		 
		 ssn=value;
	 }
	 public String getusserName() {
		 
		 return userName;
	 }
	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation();
		 obj.setName("Upskill2");
		 obj.getusserName();
		 System.out.println(obj.getusserName());
		System.out.println(obj.getName());
		
		
		
	}

}
