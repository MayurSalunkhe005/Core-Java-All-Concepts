package strings;

public class ReplaceMethod {
	public static void main(String[] args) {

		String s = "This is demo";
		System.out.println(s.replace("is", "was"));
		System.out.println(s.replaceFirst("is", "ere"));
		System.out.println(s.replaceAll(s, "hello demo"));
		System.out.println(s.replaceAll("is(.)", "was"));
		System.out.println(s.replaceAll("is(.*)", "ose people are to kind"));
		
	}
}
	