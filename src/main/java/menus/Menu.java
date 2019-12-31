package menus;

import io.Prompter;

public class Menu {
	private final Prompter prompter;
	
	private final String title;
	private final HasDescription[] options;
	
	public Menu(Prompter prompter, String title, HasDescription[] options) {
		this.prompter = prompter;
		this.title = title;
		this.options = options;
	}
	
	public HasDescription prompt() {
		if (title != null) {
			prompter.println(title);
		}
		
		for (int i = 0; i < options.length; i++) {
			prompter.println(String.format("%d. %s", i + 1, options[i].getDescription()));
		}
		
		int entry = prompter.promptForInt("Please select from the above options: ", 1, options.length);
		return options[entry - 1];
	}
}
