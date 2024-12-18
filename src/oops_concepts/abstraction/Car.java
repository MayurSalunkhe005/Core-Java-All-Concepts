package oops_concepts.abstraction;

public class Car extends Vehicle {

	void start() {
		System.out.println("Car start with key");
	}

	public static void main(String[] args) {

		Car car = new Car();
		car.start();

		Scooter scooter = new Scooter();
		scooter.start();

	}
}