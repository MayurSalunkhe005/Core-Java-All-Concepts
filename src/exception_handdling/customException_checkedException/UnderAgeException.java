package exception_handdling.customException_checkedException;

//checked exception
public class UnderAgeException extends Exception {

//	UnderAgeException() {
//		super("you are under age");
//	}

	UnderAgeException(String messege) {
		super(messege);
	}
}

class Voting {
	// public static void main(String[] args) throws UnderAgeException {
	public static void main(String[] args) {

		int age = 17;
		try {
			if (age < 18) {
				throw new UnderAgeException("you are not eligible**");

			} else {
				System.out.println("you can vote");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("continue");
	}
}