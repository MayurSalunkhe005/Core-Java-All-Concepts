package basic.variable;

public class Var2 {

	int z = 10;
	final static float PI = (float) 3.14;

	static int y = 20;

	public static void main(String[] args) {

		Var var = new Var();
		System.out.println(var.b);
		System.out.println(var.d);

		var.m1();

		System.out.println(Var.c);
		System.out.println(y);

	}

}
