package exception_handdling.finally_block;

public class FinallyBlock {
	public static void main(String[] args) {
//if exception not occurs in try block then catch block not executed finally block executes directly,
		// and if exception is occur then all blocks are execute
		try {
			int a = 100, b = 0, c;
			c = a / b;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("I am finally block");
		}
		System.out.println("CONTINUE..");
	}
}
