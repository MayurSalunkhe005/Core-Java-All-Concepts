package oops_concepts.use_of_super_keyword;

class A3 {
	A3() {
		System.out.println("i am in class A3");
	}
}

class B3 extends A3 {
	B3() {
		// super() can be used to invoke immediate parent class constructor
		super();// constructor //if we not write super
		System.out.println("i am in class B3");
	}

	public static void main(String[] args) {
		B3 a3 = new B3();

	}
}
