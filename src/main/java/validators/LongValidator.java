package validators;

public class LongValidator implements Validator {
	private final long minimum;
	private final long maximum;
	
	public LongValidator(long minimum, long maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

	@Override
	public String validate(String value) {
		try {
			long i = Long.parseLong(value);
			if (i < minimum || i > maximum) {
				return "Please enter an integer value between " + minimum + " and " + maximum + " inclusive";
			}
			return null;
		} catch (NumberFormatException e) {
			return "Please enter an integer value";
		}
		
	}

}
