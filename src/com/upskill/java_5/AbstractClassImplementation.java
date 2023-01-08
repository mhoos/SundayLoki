package com.upskill.java_5;

public class AbstractClassImplementation extends AbstractClass{

	@Override
	public void iDoor() {
		
		System.out.println("My car has 2 door !");
		
	}

	@Override
	public int iwheel() {
		System.out.println("My car has 4 wheel");
		return 4;
	}

	@Override
	public String iEngine() {
		
		System.out.println("My car has 5 hp engine !");
		
		return "5 hp";
	}

	@Override
	public void window() {
		// TODO Auto-generated method stub
		
	}

}
