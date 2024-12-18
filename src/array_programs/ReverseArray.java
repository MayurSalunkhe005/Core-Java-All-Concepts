package array_programs;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArray {
	public static void main(String[] args) {

		int[] x = { 11, 12, 13, 14, 15 };
		int[] rev = new int[5];
		int[] y = new int[5];

	
		for (int i = 0; i < x.length; i++) {
			y[i] = x[i];
			System.out.print(y[i]+",");
		}

		System.out.println();
		System.out.println("Revers by simple method: ");
		for (int i = x.length - 1; i >= 0; i--) {
			rev[i] = x[i];
			System.out.print(rev[i] + ",");
		}
		System.out.println();

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < x.length; i++) {
			al.add(x[i]);
			System.out.print(x[i] + ",");
		}
		System.out.println();

		ArrayList al1 = new ArrayList<>();
		al1.add(1);
		al1.add(2);
		al1.add("mayur");
		al1.add(12.8);
		al1.add('a');

		System.out.println(al1);
		System.out.println(al1.isEmpty());
		System.out.println(al1.contains(13));
		System.out.println(al1.size());

		Collections.reverse(al1);
		System.out.println("reverse : " + al1);

		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + ",");
		}

		System.out.println();
		for (int i = (x.length - 1); i >= 0; i--) {
			System.out.print(x[i] + ",");
		}

	}
}