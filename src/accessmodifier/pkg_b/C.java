package accessmodifier.pkg_b;

import accessmodifier.pkg_a.A;

public class C extends A{

	/*
	 * public int x = 10; static int y = 20;
	 */

	public static void main(String[] args) {
		C c = new C();
		c.m1();
		System.out.println(c.x);
	}
}