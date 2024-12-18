package exception_handdling.throws_keyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWrite {

	void readFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("d:/abc.txt");

	}

	void saveFile() throws FileNotFoundException {
		String text = "this is demo";
		FileOutputStream fos = new FileOutputStream("d:/xyz.txt");

	}
}
