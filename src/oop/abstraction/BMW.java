package oop.abstraction;

public class BMW extends MotorCar implements Car{


	public void start() {
		System.out.println("Start feature has auto start mechanism");
	}

	public void stop() {
		System.out.println("Hydrolic break");
		
	}

	public void shape() {
		System.out.println("Little longer than Toyota model");
		
	}

	public void electricEngine() {
		System.out.println("Using Hydrozen");
		
	}
	
	public void fly() {
		System.out.println("A car can fly in 2 mile high");
		
	}

}
