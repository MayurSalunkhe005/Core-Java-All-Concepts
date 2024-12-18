package controll_statement;

public class SwapNumber1 {
	public static void main(String[] args) {
		
		//swap without using third value
		
		int a=10,b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}
