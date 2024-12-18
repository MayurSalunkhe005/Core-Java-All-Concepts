package programs;

public class Factorial {
	public static void main(String[] args) {

		/*
		 * long num = 5; long fact = 1;
		 * 
		 * for (long i = num; i > 1; i--) { fact = fact * i; System.out.println(fact);
		 * 
		 * } System.out.println(fact);
		 */

		long fact = 20;

		for (long i = fact - 1; i > 0; i--) {
			fact = fact * i;
			System.out.println(fact);
		}
	}
}
