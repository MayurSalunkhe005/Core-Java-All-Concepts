package oops_concepts.constructor;

public class Constructors1 {

	int i;
	String s;

	public Constructors1(int i, String s) {
		System.out.println("i am constructor");
		this.i = i;
		this.s = s;
	}

	// default constructor
	public static void main(String[] args) {

		Constructors1 c = new Constructors1(101, "raj");

		System.out.println(c.i + " " + c.s);

	}
}
