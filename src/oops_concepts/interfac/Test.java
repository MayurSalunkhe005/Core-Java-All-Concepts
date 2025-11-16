package oops_concepts.interfac;

public class Test implements I2 {

	public static void main(String[] args) {

		// I1 i1 = new I1(); can't create object of interface

		Test t = new Test();

		t.display();

		System.out.println(Animal.a);

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub

	}

}
