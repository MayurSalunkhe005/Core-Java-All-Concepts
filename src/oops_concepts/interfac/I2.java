package oops_concepts.interfac;

public interface I2 {

	int x = 10;
	
	void display();
	void run();
	void fly();

	default void display2() {
		System.out.println(I2.x);
		
	}

	static void display1() {
		
	}
}