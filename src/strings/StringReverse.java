package strings;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {

		StringBuffer s = new StringBuffer("Mayur");
		s.reverse();
		System.out.println(s);
		System.out.println(s.reverse());

		Scanner sc = new Scanner(System.in);
		System.err.println("Enter String to be compare");
		String s1 = sc.next();
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s1.charAt(i);
		}
		System.out.println(rev);

		if (s1.equalsIgnoreCase(rev)) {
			System.out.println("String is Pallindrome");
		} else {
			System.out.println("String not pallindrome");
		}
	}
}