package controll_statement;

public class GreaterThreee {

	int a = 10, b = 20, c = 30;

	public static void main(String[] args) {

		GreaterThreee gt = new GreaterThreee();

		if (gt.a > gt.b) {
			if (gt.a > gt.c) {
				System.out.println("a is greater than c");
			} else {
				System.out.println("c is greater than a");
			}
		} else if (gt.b > gt.c) {
			System.out.println("b is greater than c");
		} else {
			System.out.println("c is greater than a & b");
		}
	}
}