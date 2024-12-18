package basic.variable;

public class Variable {
	int a = 1011;
	
	public void m1() {

	}

	void m2() {
		int b = 15;
		System.out.println(b);
		System.out.println("value of a is: " + a);
	}

	// it calls var args --> (String... args)
	public static void main(String... args) {
		Variable v = new Variable();
		v.m2();

	}
}
