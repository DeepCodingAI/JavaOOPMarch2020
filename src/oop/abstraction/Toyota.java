package oop.abstraction;

public class Toyota extends MotorCar implements Car{
	
	public void start() {
		System.out.println("Start the engine");
		
	}
	
	public void stop() {
		System.out.println("have break feature to stop the car");
		
	}

	public void shape() {
		System.out.println("must have fixed size");
		
	}

	public void electricEngine() {
		System.out.println("Lithium Ion Battery");
		
	}
	
	public void colorOfCar() {
		System.out.println("You can have any color");
	}

	public void fly() {
		System.out.println("A car can fly in 1 mile high");
		
	}

}
