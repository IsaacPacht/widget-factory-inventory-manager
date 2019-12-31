package io;

import validators.Validator;

public interface Prompter {

	void print(String message);
	void println(String message);

	String prompt(String message);
	String prompt(String message, Validator validator);
	int promptForInt(String message, int minimum, int maximum);
	long promptForLong(String message, long minimum, long maximum);
	long promptForLong(String message, Validator validator);
	
}