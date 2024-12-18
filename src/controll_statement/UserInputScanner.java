package controll_statement;

import java.util.Scanner;

public class UserInputScanner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = s.nextLine();

		System.out.println("Enter Your Age");
		int age = s.nextInt();

		System.out.println("Enter Your Gender");
		char gender = s.next().charAt(0);

		System.out.println("Enter Your Phone number");
		long phno = s.nextLong();

		System.out.println("------------------********------------------");
		System.out.println("Your Name is :" + name);
		System.out.println("Your age is :" + age);
		System.out.println("Your gender is :" + gender);
		System.out.println("Your phno is :" + phno);
	}
}
