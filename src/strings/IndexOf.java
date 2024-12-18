package strings;

import java.util.StringJoiner;

public class IndexOf {
	public static void main(String[] args) {
		String string = new String("abcd abc da");
		String string2 = new String("dab");

		String[] st = string.split(" ");

		for (int i = 0; i < st.length; i++) {
			System.out.print(st[i] + " ");
		}
		System.out.println();
		StringJoiner sj = new StringJoiner(" ");
		sj.add("hello");
		sj.add("this is");
		sj.add("MJ's Academy");

		System.out.println(sj);

		/*
		 * System.out.println(string.charAt(0));
		 * System.out.println(string.indexOf("a"));
		 * System.out.println(string.lastIndexOf("a"));
		 * System.out.println(string.trim());
		 */
		/*
		 * System.out.println(string.isEmpty()); System.out.println(string.length());
		 * System.out.println(string.indexOf("d"));
		 */

	}
}
