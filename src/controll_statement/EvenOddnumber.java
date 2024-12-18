package controll_statement;

import java.util.Scanner;

public class EvenOddnumber {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt();

		if (num % 2 == 0) {
			System.out.println("Prime number");
		} else {
			System.out.println("not a prime number");
		}
	}
}
