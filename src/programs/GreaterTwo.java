package programs;

import java.util.Scanner;

public class GreaterTwo {
	public static void main(String[] args) {

		int a = 151;
		int b = 177;
		int c = 115;

		if (a>b&&a>c) {
			System.out.println("A is Greater");
		}else if (b>c) {
			System.out.println("B is Greater");
		}else{
			System.out.println("C is Greater");
		}
	}
}