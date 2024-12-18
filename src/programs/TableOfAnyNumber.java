package programs;

public class TableOfAnyNumber {

	public static void main(String[] args) {

		int num = 5;

		for (int i = 1; i <= 10; i++) {
			int res = num * i;
			System.out.println(num + "*" + i + "=" + res);
		}
	}

}
