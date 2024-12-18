package oops_concepts.use_of_static_keyword;

public class CounterDemo {

	// due to static variable count variable is for CounterDemo class not for
	// object, as we create object count shared with object and after increment
	// count will increase.
	static int count = 0;

	CounterDemo() {
		count++;
		System.out.println(count);
	}
	static void m1(){
		
	}

	public static void main(String[] args) {
		CounterDemo cd = new CounterDemo();
		CounterDemo cd1 = new CounterDemo();
		CounterDemo cd2 = new CounterDemo();
		CounterDemo cd3 = new CounterDemo();
	}
}
