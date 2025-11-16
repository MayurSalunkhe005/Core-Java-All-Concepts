package oops_concepts.super_keyword;

public class B extends A {
	int a = 20;
	
	public B() {
		super();
		System.out.println("current class Constructor");
		
	}

	void show(int a) {
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	
	void eat() {
		System.out.println("child class eat method");
		super.eat();
	}

	public static void main(String[] args) {
		B ob1 = new B();
		ob1.show(30);
		ob1.eat();
		
	}
}
