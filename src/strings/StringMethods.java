package strings;

public class StringMethods {

	public static void main(String[] args) {
		String str1 = "HELLO";
		String str2 = "hello";
		String str3 = "World";

		// Using compareToIgnoreCase() to compare strings
		int result1 = str1.compareToIgnoreCase(str2); // should return 0 because "Hello" and "hello" are the same
														// ignoring case
		int result2 = str1.compareToIgnoreCase(str3); // should return a negative value because "Hello" is
														// lexicographically smaller than "World"

		// Output the results
		System.out.println("Comparing 'Hello' with 'hello': " + result1); // Output: 0
		System.out.println("Comparing 'Hello' with 'World': " + result2); // Output: a negative value
	}
}
