package exception_handdling;

public class Test2 {
	public static void main(String[] args) {

		// the exception which cannot checked by compiler at compiler time called as
		// unchecked exception

		/*
		 * int a = 100, b = 0, c; c = a / b;
		 * 
		 * System.out.println(c);
		 */

		String name = null;
		System.out.println(name.length());
	}
}