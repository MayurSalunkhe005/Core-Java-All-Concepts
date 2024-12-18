package basic.variable;

public class Variables {

	int a = 10;
	int a1 = 10;
	int a2 = 10;
	int a3 = 10;
	int a4 = 10;
	float x = (float) 10.5;
	static int b = 20;

	public static void main(String[] troomantech) {

		int d = Variables.b;
		System.out.println(d);
		System.out.println(b);

		Variable variable = new Variable();
		variable.

				v.a = 1000;
		v.b = 2000;
		System.out.println(v.a);
		System.out.println(v.b);

		Variables v1 = new Variables();

		System.out.println(v1.a);// instance variables change their value
		System.out.println(v1.b);// static variables not change their value

	}
}
