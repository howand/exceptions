package beyondtoday.exceptions;

public class MandatoryFieldException extends RuntimeException {

	private static final long serialVersionUID = 929683883574245898L;

	public MandatoryFieldException(String field) {
		super("The following field is mandatory and cannot be null: " + field);
	}
}
