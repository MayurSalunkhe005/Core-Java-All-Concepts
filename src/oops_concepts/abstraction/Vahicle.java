package oops_concepts.abstraction;

abstract class Vehicle {

	public void start() {

	}

	public void off() {

	}

	abstract void run();

	abstract void fly();

}

class Bike extends Vehicle {

	@Override
	void run() {
		System.out.println("Bike Can run");

	}

	@Override
	void fly() {

		System.out.println("Bike Can fly");
	}

}

class AutoRikshaw extends Vehicle {

	@Override
	void run() {
		System.out.println("AutoRikshaw Can run");

	}

	@Override
	void fly() {
		System.out.println("AutoRikshaw Can fly");

	}

}