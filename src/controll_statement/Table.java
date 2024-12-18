package controll_statement;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter table number");
		int t = sc.nextInt();

		for (int tb = 1; tb <= 10; tb++) {
			//System.out.println(tb * t);
			System.out.println(t+"*"+tb+"="+(tb*t));
		}
	}

}
