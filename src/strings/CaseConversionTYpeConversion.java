package strings;

import java.util.jar.Attributes.Name;

public class CaseConversionTYpeConversion {
	public static void main(String[] args) {
		String string = "Deepak";
		System.out.println(string.toUpperCase());
		System.out.println(string.toLowerCase());
		
		char [] c = string.toCharArray();
		System.out.println(c);
		System.out.println(c.getClass());
		
		int a=10,b=20;
		System.out.println(a+b);
		String s1 = String.valueOf(a);//convert int into String
		String s2 = String.valueOf(b);
		
		System.out.println(s1+s2);//concate 
	}
}
