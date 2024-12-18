package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class HashMap1 {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap();

		map.put(6, "amol");
		map.put(1, "mayur");
		map.put(2, null);
		map.put(3, "shashi");
		map.put(null, null);
		map.put(4, null);
		map.put(5, "ankit");

		System.out.println(map);

		for (Map.Entry me : map.entrySet()) {
			System.out.println(me.getKey() + "- > " + me.getValue());
		}

	}
}
