package strings;

public class CompareTwoStrings {
	public static void main(String[] args) {
		String s1 = new String("Mayur");
		String s2 = new String("Mayur");

		String s3 = "Mayur";
		String s4 = "Mayur";

		if (s3 == s4) {
			System.out.println("Equal");
		} else {
			System.out.println("not equal");
		}
		if (s1.equals(s3)) {
			System.out.println("Equal");
		} else {
			System.out.println("not equal");
		}
		
		System.out.println(s1.startsWith("M"));
		System.out.println(s1.endsWith("r"));
		System.out.println(s1.contains("M")+" ***********************");
		System.out.println(s1.indexOf("u"));
		System.out.println(s1.lastIndexOf("m"));
		System.out.println(s1.charAt(2));
		System.out.println(s1.contains(s4));
		System.out.println(s3.contains(s4));
		System.out.println(s1.startsWith("m"));
		System.out.println(s1.endsWith("r"));

		if (s1 == s2) {
			System.out.println("equal **");
		} else {
			System.out.println("not equal **");
		}

		if (s1.equals(s2)) {
			System.out.println("equal **");
		} else {
			System.out.println("not equal **");
		}
		if (s3 == s4) {
			System.out.println("equal **");
		} else {
			System.out.println("not equal **");
		}

		if (s3.equals(s4)) {
			System.out.println("equal *4444*");
		} else {
			System.out.println("not equal **");
		}
	}
}
