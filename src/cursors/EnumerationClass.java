package cursors;

import java.util.Enumeration;
import java.util.Properties;
import java.util.Vector;

public class EnumerationClass {
	public static void main(String[] args) {

		Properties v = new Properties();
		v.se

		System.out.println(v);
		
		Enumeration en = v.elements();
		
		while (en.hasMoreElements()) {

			System.out.println(en.nextElement());
		}
	}
}
