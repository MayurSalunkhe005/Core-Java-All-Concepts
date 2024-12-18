package cursors;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ItrClass {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("Mayur");
		l.add("vishal");
		l.add(1);
		l.add(2);
		l.add("jyoti");

		// System.out.println(l);

		Iterator itr = l.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println(itr.hasNext());
		}
	}
}
