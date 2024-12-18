package strings;

import java.util.Arrays;

public class StringMethods1 {
	public static void main(String[] args) {

		/*
		 * String s = "programing"; System.out.println(s.length());
		 * 
		 * byte b[] = s.getBytes(); // This directly converts the string to a byte array
		 * 
		 * // Optionally, you can print the byte array to verify for (byte value : b) {
		 * System.out.print(value + " "); }
		 */

		String s1 = "Gaurav";
		String s2 = "rhgfa";
		
		System.out.println(s1.substring(3));
		
		System.out.println(s1.lastIndexOf("a"));

		if (s1.compareTo(s2) < 0) {
			System.out.println("s2 is greater");
		} else {
			System.out.println("s1 is greater");
		}

		System.out.println(s1.startsWith("au"));
		System.out.println(s1.endsWith("rav"));

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		/*
		 * char ch[] = new char[4]; s1.getChars(2, 6, ch, 0); System.out.println(ch);
		 * System.out.println(s1.length()); System.out.println(s1.indexOf('a'));
		 * System.out.println(s1.concat(s2)); System.out.println(s1.concat("khedekar"));
		 * System.out.println(s1.charAt(2));
		 */

	}
}
