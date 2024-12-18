package array_programs;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddNumbers {
	public static void main(String[] args) {
		int[] x = { 21, 26, 56, 98, 48, 15, 30, 21, 25 };

		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < x.length; i++) {
			al.add(x[i]);
		}
		al.remove(3);// to remove element from array

		List<Integer> al2 = al.stream().filter(p -> p > 30).collect(Collectors.toList());
		System.out.println(al2);

		System.out.println("sort");// sorting
		Collections.sort(al);
		System.out.println(al);

		// Stream API
		// to find even odd numbers from array
		System.out.print("Even : ");
		List<Integer> l = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(l);

		System.out.print("Odd : ");
		List<Integer> l1 = al.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		System.out.println(l1);

		// add 10 in all elements
		System.out.println("add 10 in all elements");
		List<Integer> i3 = al.stream().map(i -> i + 10).collect(Collectors.toList());
		System.out.println(i3);

		// add 5 in all elements
		System.out.println("add 5 in all elements");
		List<Integer> l2 = al.stream().map(i -> i + 5).collect(Collectors.toList());
		System.out.println(l2);

		// count elements of array
		System.out.println("Count : ");
		int count = (int) al.stream().count();
		System.out.println(count);

		// normal way to find even odd numbers from array
		System.out.print("even num : ");
		for (int even : x) {
			if (even % 2 == 0) {
				System.out.print(even + ",");
			}
		}
		System.out.println();
		System.out.print("odd num : ");
		for (int odd : x) {
			if (odd % 2 != 0) {
				System.out.print(odd + ",");
			}
		}

	}
}