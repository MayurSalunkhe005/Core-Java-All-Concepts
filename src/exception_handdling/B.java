package exception_handdling;

public class B {
	public static void main(String[] args) {

		int a = 100, b = 0, c;

		try {
			c = a / b;
		} catch (Exception e) {
			System.out.println("thorow arithmatic exception");

			e.printStackTrace();
			
		}

		System.out.println("hello normal flow maintained");
		System.out.println("hello normal flow maintained");
		System.out.println("hello normal flow maintained");
	}
}
