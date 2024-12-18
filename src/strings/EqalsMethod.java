package strings;

import java.util.AbstractMap;
import java.util.Enumeration;

public class EqalsMethod {
	public static void main(String[] args) {
		String s1 = new String("Mayur");
		String s2 = new String("Mayur");
		
		
		
		
		
		System.out.println(s1==s2);//compare memory addresses
		System.out.println(s1.equals(s2));//compare content
	}
}
