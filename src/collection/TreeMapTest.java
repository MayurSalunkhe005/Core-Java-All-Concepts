package collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {

		TreeMap tm = new TreeMap();

		tm.put(104, "Mayur");
		tm.put(101, "Mayur");
		tm.put(105, "Jyoti");
		tm.put(102, "Shashi");
		tm.put(103, "Mahesh");

//		tm.put("Mayur", 104);
//		tm.put("Mayur", 101);
//		tm.put("Jyoti", 101);
//		tm.put("Shashi", 102);
//		tm.put("Mahesh", 103);

		System.out.println(tm);
		System.out.println(tm.ceilingKey(102));
		System.out.println(tm.ceilingEntry(102));
	}
}
