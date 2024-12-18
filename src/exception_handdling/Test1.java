package exception_handdling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test1 {
	public static void main(String[] args) {
		
		// checked exception - compiler can check exception at compile time called as
		// checked exception
		
			try {
				FileInputStream fis1 = new FileInputStream("d:/abc.txt");
			} catch (Exception e) {
				e.printStackTrace();
				//System.out.println(e);
			}
		
			
			
			
			
			
			
			
			
			
			
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}
}
