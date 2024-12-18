package methods;

import java.util.Scanner;

import javax.security.auth.Subject;

public class MethodsDemo {

	public int add(int x, int y) {
		return x + y;

	}

	public static void main(String[] args) {

		/*
		 * MethodsDemo mDemo = new MethodsDemo(); int addtion = mDemo.add(4, 5);
		 * System.out.println(addtion);
		 */

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Enter Two Numbers"); int a = scanner.nextInt(); int b =
		 * scanner.nextInt(); MethodsDemo mDemo = new MethodsDemo();
		 * 
		 * int addtion1 = mDemo.add(a, b); System.out.println(addtion1);
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		/* int mDemo = new MethodsDemo().add(a, b); */
		System.out.println(new MethodsDemo().add(a, b));

	}
}
