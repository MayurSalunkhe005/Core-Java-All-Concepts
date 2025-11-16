package exception_handdling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class A {
	public static void main(String[] args) throws IOException {

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("hello.txt");
		} catch (FileNotFoundException fnfe) {
			System.out.println(fnfe);
		} finally {

			if (fis != null) {
				fis.close();
			}
		}

		System.out.println("Program Continue...");

	}
}
