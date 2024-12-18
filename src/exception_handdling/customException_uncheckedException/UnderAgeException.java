package exception_handdling.customException_uncheckedException;

public class UnderAgeException extends RuntimeException {

	UnderAgeException() {
		super("you can't vote");
	}

	UnderAgeException(String messege) {
		super(messege);
	}
}

class Voting {
	public static void main(String[] args) {
		int age = 16;

		try {
			if (age < 18) {
				throw new UnderAgeException("not eligible to vote..");

			} else {
				System.out.println("you can vote");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("continue");
	}
}
