package controll_statement;

import java.util.Scanner;

public class CalculaterUsingSwithCase {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter 1st number");
			int fno = sc.nextInt();

			System.out.println("Enter 2nd number");
			int sno = sc.nextInt();

			System.out.println("Choose operater: (+,-,*,/)");
			String sym = sc.next();
			int res;

			switch (sym) {
			case "+":
				res = fno + sno;
				System.out.println(res);

				break;
			case "-":
				res = fno - sno;
				System.out.println(res);

				break;
			case "*":
				res = fno * sno;
				System.out.println(res);

				break;
			case "/":
				res = fno / sno;
				System.out.println(res);

				break;

			default:
				System.out.println("Enter correct5 oprator");
				break;
			}
		}

	}
}
