package oops_concepts.polymorphism;

public class Test {

	void show() {

		System.out.println("show from Test class");
	}

	public static void main(String[] args) {

		Xyz xyz = new Xyz();
		xyz.show();

	}
}

class Xyz extends Test{

	void show() {
		super.show();
		System.out.println("show from Xyz class");

	}

}