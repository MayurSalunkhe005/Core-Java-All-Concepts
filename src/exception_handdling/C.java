package exception_handdling;

public class C {

	public static void main(String[] args) {

		try {
			int a = 100, b = 0, c;
			c = a / b;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
			
		}
		//System.out.println(c);

		System.out.println("i have handled exception");
		System.out.println("i have handled exception");
		System.out.println("i have handled exception");
		System.out.println("i have handled exception");

	}
}
