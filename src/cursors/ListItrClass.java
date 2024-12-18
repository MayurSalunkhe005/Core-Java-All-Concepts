package cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListItrClass {
	public static void main(String[] args) {

		List l = new ArrayList();
		l.add("mayur");
		l.add("jyoti");
		l.add(1);
		l.add(2);
		System.out.println(l);

		ListIterator listitr = l.listIterator();

		while (listitr.hasNext()) {
			System.out.println(listitr.next());
		}
System.out.println("----*****-------******-");
		while (listitr.hasPrevious()) {
			System.out.println(listitr.previous());
		}
		l.set(2, "sonu");
		System.out.println(l);
		l.remove(0);
		System.out.println(l);
	}
}
