package oops_concepts.use_of_super_keyword;

class A2 {
	void m1() {
		System.out.println("i am in class A2");
	}
}

class B2 extends A2 {
	void m1() {
		System.out.println("i am in class B2");
	}

	void show() {
		m1();
		//super keyword can be used to invoke immediate parent class method.
		super.m1();
	}
 
	public static void main(String[] args) {
		B2 a = new B2();
		a.show();
	}
}
