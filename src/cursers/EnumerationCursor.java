package cursers;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class EnumerationCursor {
	public static void main(String[] args) {

		Vector vector = new Vector();
		vector.add("mayur");
		vector.add(1);
		vector.add(1.23);
		vector.add("salunkhe");

		
		System.out.println(vector.capacity()+": capacity");

		Iterator i = vector.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		Enumeration e = vector.elements();

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}
}
