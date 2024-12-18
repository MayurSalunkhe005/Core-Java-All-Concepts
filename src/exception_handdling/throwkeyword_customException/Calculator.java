package exception_handdling.throwkeyword_customException;

public class Calculator {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		try {
			calculator.calculateSum(70, 45);

		} catch (SumShouldNotBeGreaterThan100 e) {

			e.printStackTrace();

		}
	}

	public int calculateSum(int num1, int num2) throws SumShouldNotBeGreaterThan100 {

		int sum = num1 + num2;

		if (sum > 100) {

			throw new SumShouldNotBeGreaterThan100("Sum should not be grester than 100" + sum);

		} else {
			System.out.println("your sum is correct or sum is less than 100");
		}

		return sum;
	}

}
