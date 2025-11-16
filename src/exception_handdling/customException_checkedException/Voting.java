package exception_handdling.customException_checkedException;

import java.lang.Runnable;

public class C extends new Runnable() {
	public void run() {
		
	}
} {
	// public static void main(String[] args) throws UnderAgeException {
	public static void main(String[] args) {

		int age = 17;
		try {
			if (age < 18) {
				throw new Voting("you are not eligible**");

			} else {
				System.out.println("you can vote");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("continue");
	}
}

//checked exception
class Voting1 extends runna {

//	UnderAgeException() {
//		super("you are under age");
//	}

	Voting(String messege) {
		super(messege);
	}
}
