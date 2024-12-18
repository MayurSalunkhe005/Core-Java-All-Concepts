package oops_concepts.use_of_this_keyword;

public class ThisDemo1 {

	int i;

	void setValue(int i) {
//this keyword is used to invoke current class instance variable
		this.i = i;
	}

	void show() {
		System.out.println(i);
	}

	public static void main(String[] args) {
		ThisDemo1 thisDemo1 = new ThisDemo1();
		thisDemo1.setValue(202);
		thisDemo1.show();
	}
}
