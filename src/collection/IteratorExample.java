package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.swing.DefaultRowSorter;

public class IteratorExample {

	public static void main(String[] args) {

		List l = new ArrayList();

		l.add(10);
		l.add("mayur");
		l.add("salunkhe");

		ListIterator lit = l.listIterator();

		while (lit.hasNext()) {
			System.out.println(lit.next());
		}

		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}
}
