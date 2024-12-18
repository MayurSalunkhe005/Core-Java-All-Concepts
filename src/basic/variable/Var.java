package basic.variable;

import oops_concepts.use_of_static_keyword.StaticBlock;

public class Var {

	public void m1() {
		System.out.println("I am M1 method");
	}

	public static void main(String[] args) {
		int b = 11;// instance vari
		int d = 102;
		float c = (float) 12.4;// static vari

		char c1 = 'a';

		System.out.println(c1);

		String s1 = new String("i am string using new keyword");
		System.out.println(s1);

		String s2 = "i am string using literal";
		System.out.println(s2);

		Var var = new Var();
		var.m1();

	}

}
