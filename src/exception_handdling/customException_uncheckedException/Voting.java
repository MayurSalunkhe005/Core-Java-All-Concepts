package exception_handdling.customException_uncheckedException;

class UnderAgeExeption extends RuntimeException {

	UnderAgeExeption(String messege) {
		super(messege);
	}
}

public class Voting {
	public static void main(String[] args) {
		int age = 16;

		try {
			if (age < 18) {
				throw new UnderAgeExeption("not eligible to vote..");

			} else {
				System.out.println("you can vote");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("continue");
	}
}
