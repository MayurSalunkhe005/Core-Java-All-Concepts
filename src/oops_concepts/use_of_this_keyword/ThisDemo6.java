package oops_concepts.use_of_this_keyword;

public class ThisDemo6 {

	ThisDemo6 m1() {
//this keyword can be used to return current class instance from the method
		return this;
	}

	public static void main(String[] args) {
		ThisDemo6 td = new ThisDemo6();
		td.m1();
	}
}
