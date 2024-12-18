package controll_statement;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		long num = sc.nextInt();

		long fact = 1;

		/*
		 * for (int i = 1; i <= num; i++) { fact = fact * i;
		 * 
		 * } System.out.println(fact);
		 */

		for (long i = num; i > 1; i--) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
