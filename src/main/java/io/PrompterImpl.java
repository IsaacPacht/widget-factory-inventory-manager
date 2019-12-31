package io;

import validators.IntegerValidator;
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
		String str = prompt(message, new IntegerValidator(minimum, maximum));
		return Integer.parseInt(str);
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
}
