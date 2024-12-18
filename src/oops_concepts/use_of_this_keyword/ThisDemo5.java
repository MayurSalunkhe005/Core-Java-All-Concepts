package oops_concepts.use_of_this_keyword;

class Test {

	Test(ThisDemo5 td) {
		System.out.println("test class constructor");
	}
}

public class ThisDemo5 {
	void m1() {
//this keyword can be used to pass as an argument in the constructor call 
		Test t = new Test(this);
	}

	public static void main(String[] args) {
		ThisDemo5 td = new ThisDemo5();
		td.m1();
	}
}
