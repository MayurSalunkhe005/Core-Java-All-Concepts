package oops_concepts.use_of_super_keyword;

class A1 {

	int a = 10;
}

//--- 
public class B1 extends A1 {
	
	int a = 20;

	void show(int a) {
		
		System.out.println(a);
		
		System.out.println("this:" + this.a);
		
		//super keyword refers to the immediate parent class instance variable.	
		System.out.println("super:" + super.a);
	}

	public static void main(String[] args) {
		B1 b = new B1();
		b.show(251);
	}

}
