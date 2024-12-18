package oops_concepts.use_of_this_keyword;

public class ThisDemo2 {

	void display() {
		System.out.println("Hello i am display");
	}
	void show() {
//this keyword can be used to invoke current class method 
		this.display();
	}
	

	public static void main(String[] args) {
		
		ThisDemo2 tDemo = new ThisDemo2();
		tDemo.show();
		
	}
}
