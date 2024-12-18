package strings;

import java.util.Iterator;

public class Palindrome {
	public static void main(String[] args) {

		String string = "NiTin";
		String rev = "";

		for (int i = 4; i >= 0; i--) {
			rev = rev + string.charAt(i);
		}
		System.out.println(rev);

		if (string.equalsIgnoreCase(rev)) {
			System.out.println("palindrom");
		} else {
			System.out.println("not palindrom");
		}

		String s = "nitinnitin";
		String rev1 = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev1 = rev1 + s.charAt(i);

		}
		System.out.println(rev1);

		if (s.equals(rev1)) {
			System.out.println("string is pallindrome");
		} else {
			System.out.println("not pallindrome");
		}

	}

}
