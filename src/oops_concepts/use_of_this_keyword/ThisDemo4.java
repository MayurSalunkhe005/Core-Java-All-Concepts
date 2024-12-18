package oops_concepts.use_of_this_keyword;

public class ThisDemo4 {
	
	void m1(ThisDemo4 td) {
		System.out.println("i am in m1 method");
	}

	void m2() {
//"this" keyword can be pass as an argument in the method call
		m1(this);
	}

	public static void main(String[] args) {
		
		ThisDemo4 thisDemo4 = new ThisDemo4();
		
		thisDemo4.m2();
	}
}
