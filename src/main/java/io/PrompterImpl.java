package io;

import validators.LongValidator;
import validators.Validator;

public class PrompterImpl implements Prompter {
	private final InputOutput io;

	public PrompterImpl(InputOutput io) {
		this.io = io;
	}
	
	public String prompt(String message) {
		print(message);
		return io.readLine();
	}

	public void print(String message) {
		io.print(message);
	}
	
	public void println(String message) {
		print(String.format("%s%n", message));
	}

	public int promptForInt(String message, int minimum, int maximum) {
		String str = prompt(message, new LongValidator(minimum, maximum));
		return Integer.parseInt(str);
	}

	public long promptForLong(String message, long minimum, long maximum) {
		return promptForLong(message, new LongValidator(minimum, maximum));
	}
	
	@Override
	public String prompt(String message, Validator validator) {
		while (true) {
			String value = prompt(message);
			String errorMessage = validator.validate(value);
			if (errorMessage == null) {
				return value;
			}
			
			println(errorMessage);
		}
	}

	@Override
	public long promptForLong(String message, Validator validator) {
		String value = prompt(message, validator);
		return Long.parseLong(value); 
	}
}
