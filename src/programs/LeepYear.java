package programs;

public class LeepYear {
	public static void main(String[] args) {
		int year = 2100;

		if ((year % 400 == 0) && (year % 4 == 0 || year % 100 != 0)) {
			System.out.println("this is leap year");
		} else {
			System.out.println("this is not leap year");
		}
	}
}
