package oop.abstraction;

public class TestCar {

	public static void main(String[] args) {
		Car car = null;
		
		car = new Toyota();
		car.shape();
		car.start();
		car.stop();
	
		car = new BMW();
		car.shape();
		car.start();
		car.stop();
		
		MotorCar motorCar = new Toyota();
		motorCar.electricEngine();
		
		motorCar = new BMW();
		motorCar.electricEngine();
		
		Toyota camry = new Toyota();
		camry.colorOfCar();
		
		FlyingCar.speed();
		
	}

}
