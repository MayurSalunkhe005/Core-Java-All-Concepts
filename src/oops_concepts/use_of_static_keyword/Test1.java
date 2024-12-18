package oops_concepts.use_of_static_keyword;

public class Test1 {
	static int a = 20;
	int b = 25;

	void display() {
		show();// static method can call in non static method
		System.out.println(b);
		System.out.println(a);
		System.out.println("I am non-static display method ");
	}

	static void show() {
		display();// non static method cannot call in static method

		System.out.println(this.b);// in static method we can't use "this" and "super" keyword
		System.out.println(super.b);
		System.out.println(b);// non static variable cannot call in static method

		System.out.println("I am static show method");

	}

	public static void main(String[] args) {
		System.out.println(Test1.a);
		show();
		Test1 t = new Test1();
		t.display();
		Test1.show();
	}
}
