package oops_concepts.final_keyword;

class Demo1 {
	//due to final keyword wee cannot override that method
	final void m1() {
		System.out.println("I am in class Demo1");
	}
}

class Test1 extends Demo1 {
	void m1() {
		System.out.println("i am in Test1 class");
	}

	public static void main(String[] args) {

		Test1 test1 = new Test1();
		test1.m1();

	}
}
