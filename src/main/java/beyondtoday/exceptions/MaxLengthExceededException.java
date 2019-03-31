package beyondtoday.exceptions;

public class MaxLengthExceededException extends RuntimeException {

	private static final long serialVersionUID = 1783469450394124818L;

	public MaxLengthExceededException(String data) {
		super("Maximum allowed characters exceeded: " + data);
	}
}
