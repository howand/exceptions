package beyondtoday.exceptions;

public class DuplicateRequestException extends RuntimeException {
	
	private static final long serialVersionUID = -8625793925718452034L;

	public DuplicateRequestException(String data) {
		super("Duplicate request" + data);
	}
}
