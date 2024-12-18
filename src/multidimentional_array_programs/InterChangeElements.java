package multidimentional_array_programs;

public class InterChangeElements {
	public static void main(String[] args) {

		int x[][] = { { 10, 11, 12, 13 }, { 0, 0, 0, 0 } };

		for (int i = 0; i < x[0].length; i++) {
			x[1][i] = x[0][i];

			System.out.print(x[1][i]);
		}
	}
}
