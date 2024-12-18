package oops_concepts.use_of_static_keyword;

class Test extends CounterDemo {
	
	void m1(){
		
	}
	// use of static keyword
	static int a = 10;
	int b = 20;
}


public class Demo extends Test {

	public static void main(String[] args) {

		System.out.println(Test1.a);// to call static variable don't need to create an object
		// we can call static variable by class name ex."Test".

		Demo demo = new Demo();
		Test test = new Test();
		System.out.println(test.b);//b is non static variable, 
		System.out.println(demo.b);//b is non static variable, 
		System.out.println(test.a);
		System.out.println(demo.a);

	}
}
