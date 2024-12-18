package exception_handdling;

public class Test5 {
	public static void main(String[] args) {
//we can handle exception at actual method or in caller method
		Test5 test5 = new Test5();

		// Exception can handle here
		try {
			test5.divide();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("hello Mayur");
	}

	void divide() {
		// or exception can handle here
		int a = 100, b = 0, c;
		c = a / b;
		System.out.println(c);
	}

}
