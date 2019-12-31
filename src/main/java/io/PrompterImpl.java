package io;

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
		String str = prompt(message);
		return Integer.parseInt(str);
	}
}
