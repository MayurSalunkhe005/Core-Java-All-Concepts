package oops_concepts.use_of_this_keyword;

public class ThisDemo3 {

	/*
	 * ThisDemo3() {
	 * 
	 * System.out.println("no args constructor"); } ThisDemo3(int i) { this();
	 * System.out.println(i); System.out.println("parameterized constructor"); }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * ThisDemo3 thisDemo3 = new ThisDemo3(12); }
	 */

	ThisDemo3() {
//this key word can be use to invoke current class constructor
		this(12);
		System.out.println("no args constructor");
	}

	ThisDemo3(int i) {

		System.out.println(i);
		System.out.println("parameterized constructor");
	}

	public static void main(String[] args) {

		ThisDemo3 thisDemo3 = new ThisDemo3();
	}
}
