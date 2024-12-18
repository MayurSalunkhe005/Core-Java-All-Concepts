package oops_concepts.use_of_static_keyword;

public class StaticBlock {

	{
		// to execute instance block we need to create an object
		System.out.println("i am instance block");
	}
	static {
		// to execute static block we don't need to create an object
		System.out.println("i am static block");
	}

	public static void main(String[] args) {
		System.out.println("i am main method");

		StaticBlock staticBlock = new StaticBlock();
	}
}
