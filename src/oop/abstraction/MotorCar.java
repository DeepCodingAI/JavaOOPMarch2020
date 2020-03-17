package oop.abstraction;

public abstract class MotorCar implements FlyingCar{

	public void motorEngine() {
		System.out.println("Car has motor that runs on Gasoline");
	}
	
	public abstract void electricEngine();
}
