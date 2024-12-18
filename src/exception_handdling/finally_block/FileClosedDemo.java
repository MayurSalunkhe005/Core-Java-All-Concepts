package exception_handdling.finally_block;

import java.io.FileInputStream;
import java.io.IOException;

public class FileClosedDemo {
	public static void main(String[] args) throws IOException {

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("d:/abc.txt");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("file not found exception");
			// System.exit(0);// if we use this line finally block will not null
		} finally {
			// cleanup code
			if (fis != null) {
				fis.close();
			}
			System.out.println("file closed");
		}
	}
}
