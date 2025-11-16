package oops_concepts.interfac;

public interface Animal {

	int a = 10;// static final by default
	
	default public void start() {

	}

	default public void off() {

	}

	void run();

	void fly();

}

interface Vehicle {

	void run();

	void fly();
}

class Dog implements Vehicle, Animal {

	@Override
	public void fly() {
		System.out.println("Dog Can fly");

	}

	@Override
	public void run() {
		System.out.println("Dog can run");

	}

}