package cursers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorCursers {
	public static void main(String[] args) {
		ArrayList aList = new ArrayList<>();

		aList.add(45);
		aList.add("shashi");
		aList.add('c');
		aList.add(54);

		System.out.println(aList);

		ListIterator li = aList.listIterator();

		while (li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("==================================");

		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}
}
