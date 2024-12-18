package exception_handdling.throwkeyword_customException;

public class YoungerAgeException extends RuntimeException {

	// we extends RuntimeException because we are creating unchecked
	// exception(custom exception)

	public YoungerAgeException(String msg) {
		super(msg);
	}
}
