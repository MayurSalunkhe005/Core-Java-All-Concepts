package controll_statement;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scanner.next();
		
		int leng = name.length();
		String rev = "";

		for (int i = (leng - 1); i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println("your name in reverse form: "+rev);
	}
}
