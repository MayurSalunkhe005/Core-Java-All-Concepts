package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ALClass {
	public static void main(String[] args) {

		List al = new ArrayList();
		al.add(10);
		al.add("Mayur");
		al.add(20);
		al.add("vishal");
		al.add(30);

		System.out.println("tyhis is ArrayList: " + al);

		System.out.println(al.remove(2));
		System.out.println(al);

		List li = new LinkedList(al);
		System.out.println("this is LinkedList: " + al);

	}
}
