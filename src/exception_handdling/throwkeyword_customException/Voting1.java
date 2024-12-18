package exception_handdling.throwkeyword_customException;

import java.util.Scanner;

public class Voting1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your age");
		int age = scanner.nextInt();

		try {
			if (age < 18) {
				throw new YoungerAgeException1("not eligible , your age is : " + age);
			} else {
				System.out.println("you can vote");
			}
		} catch (YoungerAgeException1 e) {
			e.printStackTrace();
		}

		System.out.println("hello");
	}

}
