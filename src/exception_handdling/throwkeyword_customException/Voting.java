package exception_handdling.throwkeyword_customException;

import java.util.Scanner;

public class Voting {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();

		try {
			if (age < 18) {
				throw new YoungerAgeException("You are not Eligible for Vote");

			} else {
				System.out.println("You are Eligible for Vote");
			}

		} catch (YoungerAgeException e) {
			e.printStackTrace();
		}
		System.out.println("Hello");
	}
}
