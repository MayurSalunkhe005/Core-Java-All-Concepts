package programs;

import java.util.Scanner;

public class CalculatorSwitchCase {
	public static void main(String[] args) {
		String dissision;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1st number");
			int num1 = sc.nextInt();
			System.out.println("Enter 2nd number");
			int num2 = sc.nextInt();
			System.out.println("Enter Valid Operator...+,-,*,/");
			String op = sc.next();

			int res;

			switch (op) {
			case "+":
				res = num1 + num2;
				System.out.println("Result is : " + res);
				break;
			case "-":
				res = num1 - num2;
				System.out.println("Result is : " + res);
				break;
			case "*":
				res = num1 * num2;
				System.out.println("Result is : " + res);
				break;
			case "/":
				res = num1 / num2;
				System.out.println("Result is : " + res);
				break;

			default:
				System.out.println("Invalid Operator");
				break;
			}
			System.out.println("Do you want to Continue press Y or N");
			dissision = sc.next();
		} while (dissision.equalsIgnoreCase("y"));

		System.out.println("Exit succesfully");

	}

}
