package beyondtoday.exceptions;

public class MandatoryInfoException extends RuntimeException {

	private static final long serialVersionUID = -8015661524956161125L;

	public MandatoryInfoException(String data) {
		super("Mandatory data not supplied: " + data);
	}
}
