package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortedSetProgram {

	public static void main(String[] args) {

		ArrayList aList = new ArrayList();
		aList.add(40);
		aList.add(2);
		aList.add(4);
		aList.add(9);
		
		/*
		 * aList.remove(2); System.out.println(aList); aList.add(2, null);
		 */
		aList.retainAll(aList);
		System.out.println(aList);
		

		/*
		 * Iterator it = aList.iterator(); while (it.hasNext()) {
		 * System.out.print(it.next() + " "); }
		 */

		/*
		 * Collections.sort(aList);
		 * 
		 * System.out.println(aList);
		 */
		SortedSet ss = new TreeSet();
		ss.add(14);
		ss.add(13);
		ss.add(1);
		ss.add(11);
		ss.add(10);

		//System.out.println(ss);

		NavigableMap nMap = new TreeMap();
		nMap.put(5, "mayur");
		nMap.put(1, "fareen");
		nMap.put(6, "jyoti");
	//	System.out.println(nMap.ceilingKey(4));
		
		// System.out.println(nMap);
		
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		//1,2,3
		//s.push(5);
		//s.pop();
		System.out.println(s.peek());
		System.out.println(s.search(3));

	}
}
