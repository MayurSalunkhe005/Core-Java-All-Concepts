package exception_handdling;

import java.io.FileInputStream;

public class Test3 {
	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("d:/abc.txt");
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("Exception handled successfully");
	}
}
