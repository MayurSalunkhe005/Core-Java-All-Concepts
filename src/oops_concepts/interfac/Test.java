package oops_concepts.interfac;

public class Test implements I1, I2 {

	public void show() {

		System.err.println("1");
	}

	public void display() {
		System.err.println("2");
	}

	public static void main(String[] args) {

		// I1 i1 = new I1(); can't create object of interface

		Test t = new Test();
		t.show();
		t.display();

	}

}
