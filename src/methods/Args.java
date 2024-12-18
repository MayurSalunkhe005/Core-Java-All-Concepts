package methods;

import java.util.Scanner;

public class Args {

	public void add(byte x, byte y) {
		System.out.println("adding byte :" + (x + y));
	}

	public void add(short x, short y) {
		System.out.println("adding short :" + (x + y));

	}

	public void add(int x, int y) {
		System.out.println("adding int :" + (x + y));

	}

	public void add(long x, long y) {
		System.out.println("adding long :" + (x + y));

	}

	public static void main(String[] args) {

		Args args1 = new Args();
		Args args2 = new Args();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		args1.add((byte)a, (byte)b);

		/*
		 * int res = args1.add(2, 2); System.out.println(res);
		 * 
		 * byte a = 10, b = 20; System.out.println(args1.add(a, b));
		 * 
		 * System.out.println(args1.add((byte) 4, (byte) 5));
		 */

	}
}