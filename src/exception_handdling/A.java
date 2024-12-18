package exception_handdling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class A {
	public static void main(String[] args) {
		
		
		try {
			FileInputStream fis = new FileInputStream("d:abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
