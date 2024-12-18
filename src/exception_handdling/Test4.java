package exception_handdling;

public class Test4 {
	public static void main(String[] args) {
		try {
			int a = 100, b = 0, c;
			c = a / b;
			System.out.println(c);
			System.out.println("hello");
		} catch (ArithmeticException ae) {
			System.out.println(ae);
			System.out.println("you cannot divide by zero");
		}
		System.out.println("exception handled successfully");
	}
}
