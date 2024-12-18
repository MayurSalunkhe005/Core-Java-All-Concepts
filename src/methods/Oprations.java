package methods;

import java.awt.Choice;
import java.util.Scanner;

public class Oprations {

	/**
	 * <p>
	 * <font color="blue"> this method add two numbers returns {@code int} 
	 * </font> 
	 * <font color="green"> 
	 * @param x 
	 * @param y 
	 * @return int representation of result </font>
	 */

	public int add(int x, int y) {
		return x + y;
	}

	public int substract(int x, int y) {
		return x - y;
	}

	public int multiply(int x, int y) {
		return x * y;
	}

	public int divide(int x, int y) {
		return x / y;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println("=====MENU=====");
		System.out.println("for addition press 1");
		System.out.println("for subtraction press 2");
		System.out.println("for multiplication press 3");
		System.out.println("for division press 4");
		System.out.println("==============");
		System.out.println("Enter your Choice");

		int choice = scanner.nextInt();
		Oprations oprations = new Oprations();
		switch (choice) {
		case 1:
			System.out.println(oprations.add(a, b));

			break;
		case 2:
			System.out.println(oprations.substract(a, b));

			break;
		case 3:
			System.out.println(oprations.multiply(a, b));
			break;
		case 4:
			System.out.println(oprations.divide(a, b));
			break;

		default:
			System.err.println("Enter correct choice");
			break;
		}
	}
}
