package collection;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableHashMap {

	public static void main(String[] args) {

		Hashtable<Integer, String> hashtable = new Hashtable<>();

		hashtable.put(1, "mayur");
		hashtable.put(1, "Mahesh");
		hashtable.put(2, "jyoti");
		// hashtable.put(3, null);
//HashTable does not allow any null key and any null value

		System.out.println(hashtable);

		HashMap<Integer, String> hMap = new HashMap<>();

		hMap.put(1, null);
		hMap.put(null, "mayur");
		hMap.put(2, "jyoti");

//HashMap allow 1 null key and 1 null Value, duplicate not allow
		System.out.println(hMap);
	}
}
