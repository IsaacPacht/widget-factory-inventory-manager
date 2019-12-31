package io;

public interface Prompter {

	void print(String message);
	void println(String message);

	String prompt(String message);
	int promptForInt(String message, int minimum, int maximum);
	
}