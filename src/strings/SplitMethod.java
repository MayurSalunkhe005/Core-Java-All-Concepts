package strings;

public class SplitMethod {
	public static void main(String[] args) {
		String string = "Hello My interview is good";
		String[] sa = string.split(" ");
		char[] ca = string.toCharArray();
		String[] sac = string.split("");
		
		System.out.println(sac.length);
		System.out.println(ca.length);
		System.out.println("total number of words in string : " + sa.length);
	}
}
