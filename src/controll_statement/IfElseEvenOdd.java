package controll_statement;

import java.util.Scanner;

public class IfElseEvenOdd {

	public static void main(String[] args) {
 int num = 0;
while(num<=1000) {
	 Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		num = scanner.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + ": is even");
		} else {
			System.out.println(num + ": is odd");
		}
	}
}
}
