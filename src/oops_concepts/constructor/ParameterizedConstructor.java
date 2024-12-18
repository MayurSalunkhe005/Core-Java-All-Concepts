package oops_concepts.constructor;

public class ParameterizedConstructor {

	int i;
	String name;

	ParameterizedConstructor(int i, String name) {
		this.i = i;
		this.name = name;
	}

	void show() {
		System.out.println(i + " " + name);
	}

	public static void main(String[] args) {

		ParameterizedConstructor pc = new ParameterizedConstructor(101, "Vaishu");
		ParameterizedConstructor pc1 = new ParameterizedConstructor(102, "Amol");

		pc.show();
		pc1.show();

		ParameterizedConstructor p = new ParameterizedConstructor(1, "Mayur");
		ParameterizedConstructor p1 = new ParameterizedConstructor(2, "Shashi");
		ParameterizedConstructor p2 = new ParameterizedConstructor(3, "Mahesh");
		ParameterizedConstructor p3 = new ParameterizedConstructor(4, "Jyoti");

		System.out.println(p.i + " " + p.name);
		System.out.println(p1.i + " " + p1.name);
		System.out.println(p2.i + " " + p2.name);
		System.out.println(p3.i + " " + p3.name);

	}
}
