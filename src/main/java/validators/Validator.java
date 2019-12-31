package validators;

public interface Validator {
	/**
	 * If the value is not valid, returns an appropriate error message.  If the value is valid, returns null.
	 */
	String validate(String value);
}
