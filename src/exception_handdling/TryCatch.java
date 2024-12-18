package exception_handdling;

public class TryCatch {
	public static void main(String[] args) {

		try {
			int a = 100, b = 0, c;
			System.out.println("1");
			c = a / b;
			System.out.println("2");
			System.out.println(c);

			// catch block run when exception occur in try block
		} catch (ArithmeticException ae) {
			System.out.println(ae);// exception name and description and not line number
			System.out.println(ae.toString());// exception name and description not line number
			System.out.println(ae.getMessage());// it prints description only
			ae.printStackTrace();// it prints complete exception object- exception name, description,line number
		}
		System.out.println("hello");
	}
}
