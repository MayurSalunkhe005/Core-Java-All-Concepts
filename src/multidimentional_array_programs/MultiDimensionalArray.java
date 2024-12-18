package multidimentional_array_programs;

public class MultiDimensionalArray {
	public static void main(String[] args) {

		int[][] x = { { 5, 3, 6 }, { 8, 7, 4 }, { 1, 9, 2 }, { 2, 4, 6 } };

		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				sum = sum + x[i][j];
			}
		}
		System.out.println(sum);

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {

				System.out.print(x[i][j] + ",");
			}
			if (i == 0) {
				System.out.println(" - 0rh array");
			} else {
				if (i == 1) {
					System.out.println(" - 1st array");

				} else {
					System.out.println(" - 2nd array");
				}
			}
			System.out.println();
		}

		System.out.print(x[0][0]);
		System.out.println();
		System.out.print(x[2][1]);
		System.out.println();
		System.out.print(x[0][2]);
		
	}
}
