package logic_building;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {

		/*
		 * first method int number = 3; for (int i = 2; i <= number; i++) { if (number %
		 * i == 0) { System.out.println("number is not prime"); } else {
		 * System.out.println("number is prime"); break; } }
		 */

		/*
		 * // Second Method
		 * 
		 * int number = 5; boolean isPrime = true; for (int i = 2; i < number; i++) { if
		 * (number % i == 0) { System.out.println("number is not prime"); }else {
		 * System.out.println("number is prime"); break; } }
		 */

		// Third Method
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int number = sc.nextInt();

		if (isPrime(number)) {
			System.out.println("prime number");
		} else {
			System.out.println("not prime number");
		}

	}
	public static boolean isPrime(int num) {

		for (int i = 2; i <= num; i++) {
			if (num % 2 == 0) {
				return false;
			}
		}
		return true;
	}
}