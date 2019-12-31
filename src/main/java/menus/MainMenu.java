package menus;

import io.Prompter;

public class MainMenu extends Menu {

	public MainMenu(Prompter prompter) {
		super(prompter, "Main Menu", MainMenuOption.values());
	}
	
	@Override
	public MainMenuOption prompt() {
		return (MainMenuOption) super.prompt();
	}

}
